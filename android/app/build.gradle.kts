plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services") // Add the Google Services plugin
    id("org.jetbrains.kotlin.android") version "1.8.22" apply false
}

android {
    namespace = "com.example.final_app"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    defaultConfig {
        applicationId = "com.example.final_app"
        minSdk = 23 // Ensure this is set to 23
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName

        // Add this line to force the minSdkVersion during manifest merging
        multiDexEnabled = true
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }

  
    }


flutter {
    source = "../.."
}

dependencies {
    // Firebase BOM (Bill of Materials) to manage Firebase versions
    implementation(platform("com.google.firebase:firebase-bom:33.11.0"))

    // Add Firebase Analytics
    implementation("com.google.firebase:firebase-analytics")

    // Add other Firebase dependencies as needed
    // Example: Firebase Authentication
    implementation("com.google.firebase:firebase-auth")
    implementation("androidx.multidex:multidex:2.0.1")
}
