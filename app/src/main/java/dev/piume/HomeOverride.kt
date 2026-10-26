package dev.piume

import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.view.KeyEvent
import android.view.accessibility.AccessibilityEvent

/**
 * Google TV's launcher has to stay enabled (disabling it boot-loops the TV), so we take the Home key before
 * the system sees it and open our home directly; Google TV never flashes up. Holding Home still opens the
 * Google TV dashboard. Covering Google TV whenever it shows stays as the fallback for anything else that
 * opens it (e.g. Back out of the last app).
 */
class HomeOverride : AccessibilityService() {
    override fun onServiceConnected() {
        running = this
    }

    /** Turned off, from Piume's switch or Android's Accessibility settings: the app mustn't turn it back on. */
    override fun onUnbind(intent: Intent?): Boolean {
        running = null
        getSharedPreferences(K.FILE, MODE_PRIVATE).edit().putBoolean(K.HOME_OFF, true).apply()
        return super.onUnbind(intent)
    }

    override fun onKeyEvent(e: KeyEvent): Boolean {
        if (e.keyCode != KeyEvent.KEYCODE_HOME) return false
        if (zephyrHome()) return false // Zephyr TV's own service takes it now (see Zephyr)
        // Decided on release, by how long it was held: this TV's remote doesn't reliably send key repeats.
        if (e.action == KeyEvent.ACTION_UP && !e.isCanceled) {
            if (e.eventTime - e.downTime < LONG_PRESS_MS) goHome(cover = false) else performGlobalAction(GLOBAL_ACTION_NOTIFICATIONS)
        }
        return true
    }

    override fun onAccessibilityEvent(e: AccessibilityEvent) {
        if (e.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED && e.packageName == GOOGLE_TV &&
            e.className?.contains("dashboard", ignoreCase = true) != true
        ) goHome(cover = true)
    }

    // Marked as Home so the setup check can tell it from Piume being opened from the apps list. [cover]: Google TV
    // showed up by itself (Back out of an app), not the Home key: the home screen stays where it was (see onNewIntent).
    private fun goHome(cover: Boolean) = startActivity(Intent(this, MainActivity::class.java).addCategory(Intent.CATEGORY_HOME)
        .putExtra(COVER, cover).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))

    override fun onInterrupt() {}

    companion object {
        /** The bound service, so Piume's switch can turn it off without any permission. */
        var running: HomeOverride? = null
            private set
        private const val GOOGLE_TV = "com.google.android.apps.tv.launcherx"
        private const val LONG_PRESS_MS = 500L
        const val COVER = "dev.piume.COVER"
    }
}
