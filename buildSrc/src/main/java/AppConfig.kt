import org.gradle.api.JavaVersion

object AppConfig {
    const val appNamespace = "com.mooooong.melog"
    const val diNamespace = "com.mooooong.di"
    const val compileSdk = 33
    const val applicationId = "com.mooooong.melog"
    const val minSdk = 26
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val androidTestInstrumentation = "androidx.test.runner.AndroidJUnitRunner"
    const val useSupportLibrary = true
    const val buildTypeName = "release"
    const val minifyEnabled = false
    const val defaultProguardFile = "proguard-android-optimize.txt"
    const val proguardConsumerRules =  "consumer-rules.pro"

    @JvmField val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"
    const val compose = true
    const val kotlinCompilerExtensionVersion = "1.3.2"
    const val packagingOption = "/META-INF/{AL2.0,LGPL2.1}"
}