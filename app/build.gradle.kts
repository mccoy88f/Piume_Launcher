import java.util.Properties

plugins {
    id("com.android.application")
}

// No dependencies on purpose: framework Views only, to keep RAM and APK size minimal. One exception, the player
// for the Stremio add-ons' channels (see dependencies).
android {
    namespace = "dev.piume"
    compileSdk = 36

    defaultConfig {
        applicationId = "dev.piume"
        minSdk = 26
        targetSdk = 36
        versionCode = 71
        versionName = "4.2.1"
        // What's new: only this version's section of CHANGELOG.md ships, one entry per line, without ** marks.
        val notes = rootProject.file("CHANGELOG.md").readText().replace("\r", "")
            .substringAfter("\n## $versionName\n", "").substringBefore("\n## ")
            .lines().filter { it.startsWith("- ") }.map { it.removePrefix("- ").replace("**", "") }
        require(notes.isNotEmpty()) { "CHANGELOG.md has no entries under \"## $versionName\"" }
        resValue("string", "whats_new", notes.joinToString("\\n") { it.replace("'", "\\'").replace("\"", "\\\"") })
    }

    buildFeatures {
        resValues = true
    }

    // Release key lives outside the repo; keystore.properties (git-ignored) points at it. Without that file
    // (a fresh clone) release builds fall back to the debug key, so anyone can still build and sideload.
    val keys = rootProject.file("keystore.properties").takeIf { it.exists() }
        ?.let { f -> Properties().apply { f.inputStream().use { load(it) } } }
    signingConfigs {
        if (keys != null) create("release") {
            storeFile = file(keys.getProperty("storeFile"))
            storePassword = keys.getProperty("storePassword")
            keyAlias = keys.getProperty("keyAlias")
            keyPassword = keys.getProperty("keyPassword")
        }
    }

    lint {
        // Predictive back is a touch gesture; on a TV Back is the remote's key, which still reaches onBackPressed.
        disable += "GestureBackNavigation"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
            signingConfig = signingConfigs.findByName("release") ?: signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    // The one exception to "no dependencies": Media3's ExoPlayer, for the Stremio add-ons' channels (see PlayerActivity).
    val media3 = "1.11.1"
    implementation("androidx.media3:media3-exoplayer:$media3")
    implementation("androidx.media3:media3-exoplayer-hls:$media3")
    implementation("androidx.media3:media3-exoplayer-dash:$media3")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.json:json:20250517") // Android's own org.json is only stubs in unit tests
}
