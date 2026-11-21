plugins { id("com.android.application") }

android {
    namespace = "com.personal.razorwatchface"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.personal.razorwatchface"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes { release { isMinifyEnabled = false } }
}
