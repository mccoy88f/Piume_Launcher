package dev.piume

/**
 * Every key Piume keeps settings and state under, in one place: a mistyped key is a setting that silently never
 * saves. They live in the "home" preferences file (Plume's name, kept so the code stays a clean fork of it).
 * Per-app entries add the package to a prefix: "t_<package>" (when an app was last opened from a card),
 * "n_<package>" (how often it was opened from the row).
 */
internal object K {
    const val FILE = "home"

    // Look
    const val THEME = "theme"
    const val WP_LIGHT = "wp_light"
    const val WP_DARK = "wp_dark"
    const val WP_FADE = "wp_fade"
    const val WP_EVERY = "wp_every"
    const val WP_PHOTO_LIGHT = "wp_photo_light"
    const val WP_PHOTO_DARK = "wp_photo_dark"
    const val WP_PHOTO_AT_LIGHT = "wp_photo_at_light"
    const val WP_PHOTO_AT_DARK = "wp_photo_at_dark"
    const val COLOUR_ICONS = "colour_icons"
    const val CLOCK_24 = "clock_24" // "auto" (the TV's setting), "24" or "12"
    const val NIGHT = "night" // night mode on
    const val NIGHT_FROM = "night_from" // night mode window, minutes after midnight
    const val NIGHT_TO = "night_to"

    // Apps row
    const val SORT = "sort"
    const val ORDER = "order"
    const val ROW_HIDDEN = "row_hidden"
    const val ROW_ALIGN = "row_align"
    const val NAMES = "names"
    const val LOCK_PIN = "lock_pin"
    const val TIP_MOVE = "tip_move"
    const val INPUTS_MODE = "inputs_mode" // "menu" (default) or "apps"
    const val INPUTS_PINNED = "inputs_pinned" // HDMI ports pinned by hand
    const val INPUTS_IN_APPS = "inputs_in_apps" // show connected HDMI inputs in apps row even in menu mode

    // Continue Watching
    const val HIDDEN_WATCH = "hidden_watch"
    const val HIDDEN_PLAYING = "hidden_playing" // paused tracks closed from the row, "<package>/<title>"; shown again once they play
    const val CW_OFF = "cw_off"
    const val SECTIONS_OFF = "sections_off" // "pkg/section" of the app sections turned off
    const val CHANNEL_LOGOS = "channel_logos" // logos from iptv-org for channels the TV has none for
    const val EPG_URL = "epg_url" // an XMLTV guide's address, for what's on (see Epg)

    // Stremio add-ons
    const val ADDONS = "addons" // the add-ons' manifest addresses, in order, one per line (see Addons)
    const val ADDONS_VOD = "addons_vod" // where their films and series show: "tiles" (Films and Series), "apps" (an app each), "off"
    const val CINEMETA_URL = "cinemeta_url" // Cinemeta's manifest, when not Stremio's own (see MainActivity.cinemetaUrl)
    const val SECTION_NAMES = "section_names" // JSON: "pkg/section" to the name the user gave it
    const val USERS = "users" // JSON: Piume's users, [{id, name}] (see Users)
    const val USER = "user" // the id of the user in use ("": the first)
    const val ADDONS_TV = "addons_tv" // where their TV channels show: "tv" (the TV app), "iptv" (one IPTV app), "apps" (an app each)

    // Spotlight
    const val TMDB_API_KEY = "tmdb_api_key"
    const val TMDB_LANG = "tmdb_lang"
    const val TMDB_TYPE = "tmdb_type"
    const val TMDB_DEFAULT_APPS = "tmdb_default_apps"
    const val TMDB_CYCLE = "tmdb_cycle"
    const val TMDB_PROVIDERS = "tmdb_providers"
    const val TMDB_SOURCE = "tmdb_source" // "trending" or "list"
    const val TMDB_LIST = "tmdb_list" // a public TMDB list's id

    // Weather
    const val WEATHER = "weather"
    const val WX_UNIT = "wx_unit"
    const val WX_TEMP = "wx_temp"
    const val WX_CODE = "wx_code"
    const val WX_TIME = "wx_time"
    const val GEO_MANUAL = "geo_manual"
    const val GEO_CITY = "geo_city"
    const val GEO_LAT = "geo_lat"
    const val GEO_LON = "geo_lon"
    const val GEO_TIME = "geo_time"

    // Screensaver
    const val SS_FOLDER = "ss_folder"
    const val PREV_SCREENSAVER = "prev_screensaver"

    // System
    const val HOME_OFF = "home_off"
    const val SETUP_SHOWN = "setup_shown"
    const val REOPEN_ROW = "reopen_row"
    const val UPD_VER = "upd_ver"
    const val UPD_TIME = "upd_time"
    const val UPD_TOLD = "upd_told"
    const val UPD_BETA = "upd_beta" // betas (pre-releases) are offered too
    const val SEEN_NOTES = "seen_notes"
    const val ZEPHYR_TOLD = "zephyr_told" // when Zephyr TV's page last showed (-1: told it's installed; see Zephyr)
}
