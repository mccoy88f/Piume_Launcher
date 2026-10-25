package dev.piume

import android.content.SharedPreferences
import org.json.JSONArray
import org.json.JSONObject

/**
 * Piume's settings as a small JSON file, to keep on a phone and bring back after a reset or onto another TV.
 * It holds what the user chose (theme, wallpapers, the apps row, Spotlight with its TMDB key, weather...), not
 * passing state (the last weather reading, update checks) and not the layout lock PIN, which could lock someone
 * out of a TV whose PIN they no longer remember. Photos used as wallpapers stay on the TV that has them.
 */
internal object Backup {
    private const val FORMAT = 1

    /** The keys a backup carries. Everything else is state the TV works out again by itself. */
    private val KEYS = setOf(
        K.THEME, K.WP_LIGHT, K.WP_DARK, K.WP_FADE, K.WP_EVERY, K.COLOUR_ICONS,
        K.UPD_BETA, K.SORT, K.ORDER, K.ROW_HIDDEN, K.ROW_ALIGN, K.NAMES,
        K.HIDDEN_WATCH, K.CW_OFF, K.SECTIONS_OFF,
        K.TMDB_API_KEY, K.TMDB_LANG, K.TMDB_TYPE, K.TMDB_DEFAULT_APPS, K.TMDB_CYCLE, K.TMDB_PROVIDERS, K.TMDB_SOURCE, K.TMDB_LIST,
        K.WEATHER, K.WX_UNIT, K.GEO_MANUAL, K.GEO_CITY, K.GEO_LAT, K.GEO_LON,
        K.SS_FOLDER, K.CLOCK_24, K.NIGHT, K.NIGHT_FROM, K.NIGHT_TO,
    )

    fun export(prefs: SharedPreferences): String {
        val values = JSONObject()
        for ((key, value) in prefs.all) {
            if (key !in KEYS) continue
            values.put(key, when (value) {
                is String -> JSONObject().put("s", value)
                is Boolean -> JSONObject().put("b", value)
                is Int -> JSONObject().put("i", value)
                is Long -> JSONObject().put("l", value)
                is Float -> JSONObject().put("f", value.toDouble())
                is Set<*> -> JSONObject().put("set", JSONArray(value.map { it.toString() }))
                else -> continue
            })
        }
        return JSONObject().put("app", "piume").put("format", FORMAT).put("prefs", values).toString(2)
    }

    /**
     * Puts the settings in [json] back, replacing the current ones a backup covers (a setting missing from the
     * file goes back to its default). Returns how many it set; throws [IllegalArgumentException] for a file that
     * isn't a Piume backup.
     */
    fun restore(prefs: SharedPreferences, json: String): Int {
        val root = try {
            JSONObject(json)
        } catch (e: org.json.JSONException) {
            throw IllegalArgumentException("not JSON")
        }
        require(root.optString("app") == "piume" && root.optInt("format") in 1..FORMAT) { "not a Piume backup" }
        val values = root.getJSONObject("prefs")
        val edit = prefs.edit()
        KEYS.forEach { edit.remove(it) }
        var n = 0
        for (key in values.keys()) {
            if (key !in KEYS) continue // a newer Piume's setting, or something added by hand
            val v = values.optJSONObject(key) ?: continue
            when {
                v.has("s") -> edit.putString(key, v.getString("s"))
                v.has("b") -> edit.putBoolean(key, v.getBoolean("b"))
                v.has("i") -> edit.putInt(key, v.getInt("i"))
                v.has("l") -> edit.putLong(key, v.getLong("l"))
                v.has("f") -> edit.putFloat(key, v.getDouble("f").toFloat())
                v.has("set") -> v.getJSONArray("set").let { a -> edit.putStringSet(key, (0 until a.length()).map { a.getString(it) }.toSet()) }
                else -> continue
            }
            n++
        }
        edit.apply()
        return n
    }
}
