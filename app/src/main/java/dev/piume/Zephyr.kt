package dev.piume

import android.content.ContentProvider
import android.content.ContentValues
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.ParcelFileDescriptor
import android.provider.Settings
import android.view.View
import android.widget.Toast
import java.io.File
import org.json.JSONObject

// Piume is now Zephyr TV: a new name, a new app (its own package) and its own releases. This last Piume says so,
// installs Zephyr TV, and hands it what Piume kept (settings, users, what they watched, Trakt) the first time it
// starts, through MigrationProvider; then Piume can go. Functions of MainActivity, kept here by topic.

/** Zephyr TV: its package, and the repository its releases come from. */
internal const val ZEPHYR_PKG = "link.mccoy88f.zephyr"
internal const val ZEPHYR_REPO = "mccoy88f/Zephyr_TV"

/** Settings Zephyr TV doesn't take: Piume's updates and its Home setup (Zephyr TV sets itself up as Home). */
internal val NOT_HANDED = setOf(K.HOME_OFF, K.SETUP_SHOWN, K.REOPEN_ROW, K.UPD_VER, K.UPD_TIME, K.UPD_TOLD, K.SEEN_NOTES, K.ZEPHYR_TOLD)

/** The files Piume keeps per user (in its files, and in each user_<id> folder) that Zephyr TV takes. */
internal val HANDED_FILES = listOf("vod_progress.json", "vod_watched.json", "trakt.json", "trakt_seen.txt")

/**
 * What Piume hands Zephyr TV, as one JSON document read through content://dev.piume.migration/export: its settings
 * (each with its type) and its users' files. Only Zephyr TV may read it: the app asking must be it, signed with
 * Piume's own key (the same developer's), or it's refused. Written into a pipe as it's read: a long history doesn't
 * have to fit in one Binder call.
 */
class MigrationProvider : ContentProvider() {
    override fun onCreate() = true

    override fun openFile(uri: Uri, mode: String): ParcelFileDescriptor {
        val context = context ?: throw SecurityException("no context")
        val caller = callingPackage
        if (caller != ZEPHYR_PKG || context.packageManager.checkSignatures(caller, context.packageName) != PackageManager.SIGNATURE_MATCH) {
            throw SecurityException("only Zephyr TV, signed as Piume, may read this")
        }
        if (uri.lastPathSegment != "export" || mode != "r") throw IllegalArgumentException("only export, to read")
        val (read, write) = ParcelFileDescriptor.createPipe()
        Thread {
            runCatching {
                ParcelFileDescriptor.AutoCloseOutputStream(write).use { it.write(export(context.filesDir, context.getSharedPreferences(K.FILE, android.content.Context.MODE_PRIVATE)).toByteArray()) }
            }.onFailure { warn("handing Zephyr TV the data failed ($it)") }
        }.start()
        return read
    }

    /** The settings, each as {"s": …}, {"b": …}, {"i": …}, {"l": …}, {"f": …} or {"set": […]}, and the users' files by path. */
    private fun export(dir: File, prefs: android.content.SharedPreferences): String {
        val values = JSONObject()
        for ((key, value) in prefs.all) {
            if (key in NOT_HANDED) continue
            values.put(key, when (value) {
                is String -> JSONObject().put("s", value)
                is Boolean -> JSONObject().put("b", value)
                is Int -> JSONObject().put("i", value)
                is Long -> JSONObject().put("l", value)
                is Float -> JSONObject().put("f", value.toDouble())
                is Set<*> -> JSONObject().put("set", org.json.JSONArray(value.map { it.toString() }))
                else -> continue
            })
        }
        val files = JSONObject()
        val folders = listOf(dir) + (dir.listFiles { f -> f.isDirectory && f.name.startsWith("user_") }?.toList() ?: emptyList())
        for (folder in folders) for (name in HANDED_FILES) {
            val f = File(folder, name)
            if (f.isFile) files.put(if (folder == dir) name else "${folder.name}/$name", f.readText())
        }
        return JSONObject().put("app", "piume").put("prefs", values).put("files", files).toString()
    }

    override fun query(uri: Uri, projection: Array<out String>?, selection: String?, args: Array<out String>?, sort: String?): Cursor? = null
    override fun getType(uri: Uri): String = "application/json"
    override fun insert(uri: Uri, values: ContentValues?): Uri? = null
    override fun delete(uri: Uri, selection: String?, args: Array<out String>?) = 0
    override fun update(uri: Uri, values: ContentValues?, selection: String?, args: Array<out String>?) = 0
}

/** Whether Zephyr TV is installed. */
internal fun MainActivity.zephyrInstalled() = runCatching { packageManager.getPackageInfo(ZEPHYR_PKG, 0) }.isSuccess

/** Whether Zephyr TV's Home button service is on: then Piume's gives way to it (see HomeOverride.onKeyEvent). */
internal fun android.content.Context.zephyrHome(): Boolean =
    Settings.Secure.getString(contentResolver, Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES).orEmpty().contains("$ZEPHYR_PKG/")

/**
 * Back on the home screen: Zephyr TV's page once a day while it isn't installed (once, when it is), and Piume's
 * Home button service off once Zephyr TV's is on (two of them would both take the Home key).
 */
internal fun MainActivity.zephyrNow() {
    if (zephyrHome()) HomeOverride.running?.disableSelf()
    if (settingsScrim.visibility == View.VISIBLE || setupDialog != null) return
    val told = prefs.getLong(K.ZEPHYR_TOLD, 0)
    val installed = zephyrInstalled()
    if (installed && told < 0) return // told it's installed already
    if (!installed && System.currentTimeMillis() - told < 24 * 3600_000L) return
    prefs.edit().putLong(K.ZEPHYR_TOLD, if (installed) -1 else System.currentTimeMillis()).apply()
    ui.post { showZephyr() }
}

/** "Piume is now Zephyr TV": what changes, then Install Zephyr TV (or Open it, once installed) and Later. */
internal fun MainActivity.showZephyr() {
    if (settingsScrim.visibility != View.VISIBLE) showPanel()
    val installed = zephyrInstalled()
    val top = label(getString(if (installed) R.string.zephyr_installed_intro else R.string.zephyr_intro), 14f).apply {
        maxLines = 12
        setLineSpacing(0f, 1.15f)
        setPadding(dp(14), dp(4), dp(14), dp(16))
    }
    showPage(getString(R.string.zephyr_title), listOf(
        if (installed) page(getString(R.string.zephyr_open)) {
            closeLauncherSettings()
            packageManager.getLeanbackLaunchIntentForPackage(ZEPHYR_PKG)?.let { startActivity(it) }
        } else page(getString(R.string.zephyr_install)) { installZephyr() },
        page(getString(R.string.zephyr_later)) { closeLauncherSettings() },
    ), top = top) { closeLauncherSettings() }
}

/** Downloads Zephyr TV's newest release and hands it to Android, which asks to install it (see InstallResult). */
internal fun MainActivity.installZephyr() {
    if (!packageManager.canRequestPackageInstalls()) {
        Toast.makeText(this, getString(R.string.toast_update_permission), Toast.LENGTH_LONG).show()
        return openSettings(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES, Uri.parse("package:$packageName"))
    }
    Toast.makeText(this, getString(R.string.zephyr_downloading), Toast.LENGTH_LONG).show()
    longIo.execute {
        val ok = runCatching { Updater.installOther(this, "https://github.com/$ZEPHYR_REPO/releases/latest/download/ZephyrTV.apk") }
            .onFailure { warn("Zephyr TV download failed ($it)") }.isSuccess
        if (!ok) ui.post { Toast.makeText(this, getString(R.string.toast_update_download_failed), Toast.LENGTH_LONG).show() }
    }
}
