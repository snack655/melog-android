plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)
    id(Plugins.kapt)
}

@Suppress("UnstableApiUsage")
android {
    namespace = AppConfig.appNamespace
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.androidTestInstrumentation
        vectorDrawables {
            useSupportLibrary = AppConfig.useSupportLibrary
        }
    }

    buildTypes {
        getByName(AppConfig.buildTypeName) {
            isMinifyEnabled =  AppConfig.minifyEnabled
            proguardFiles(getDefaultProguardFile(AppConfig.defaultProguardFile), AppConfig.proguardConsumerRules)
        }
    }
    compileOptions {
        sourceCompatibility(AppConfig.javaVersion)
        targetCompatibility(AppConfig.javaVersion)
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
    buildFeatures {
        compose = AppConfig.compose
    }
    composeOptions {
        kotlinCompilerExtensionVersion = AppConfig.kotlinCompilerExtensionVersion
    }
    packaging {
        resources {
            excludes += AppConfig.packagingOption
        }
    }
}

dependencies {

    implementation(Libraries.androidLibraries)
    implementation(Libraries.composeLibraries)
    implementation(platform(Libraries.kotlinBom))
    implementation(platform(Libraries.composeBom))

    androidTestImplementation(Libraries.testLibraries)
    debugImplementation(Libraries.debugLibraries)
    androidTestImplementation(platform(Libraries.composeBom))
    testImplementation(Libraries.junit)
}