plugins {
    id(Plugins.library)
    id(Plugins.kotlinAndroid)
    id(Plugins.kapt)
}

android {
    namespace = AppConfig.modelNamespace
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        testInstrumentationRunner = AppConfig.androidTestInstrumentation
    }

    compileOptions {
        sourceCompatibility = AppConfig.javaVersion
        targetCompatibility = AppConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
    packaging {
        resources {
            excludes += AppConfig.packagingOption
        }
    }
}

dependencies {
    implementation(Libraries.androidLibraries)
    testImplementation(Libraries.junit)
}