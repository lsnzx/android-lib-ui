plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    `maven-publish`
}

android {
    namespace = "com.lsn.lib.ui"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        dataBinding = true
    }

}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "com.lsn.lib"
                artifactId = "ui"
                version = "1.0.0"
//                from(components["java"])
                afterEvaluate { artifact(tasks.getByName("bundleReleaseAar")) }
            }
        }
    }
}

dependencies {
    api(libs.glide)
    api(libs.airbnb.android.lottie)
    api(libs.github.refresh.kernel)
    api(libs.github.refresh.header)
    api(libs.github.refresh.footer)
    api(libs.github.inflationx.calligraphy3)
    api(libs.material)
    api(libs.androidx.appcompat)
    api(libs.androidx.core.ktx)
    api(libs.androidx.activity.ktx)
    api(libs.androidx.fragment.ktx)
    api(libs.androidx.lifecycle.viewmodel.ktx)
    api(libs.androidx.constraintlayout.constraintlayout)
    api(libs.androidx.recyclerview.recyclerview)
    api(libs.jetbrains.kotlin.reflect)
    api("com.github.lsnzx:android-lib-res:1.0.0")
    api(libs.github.inflationx.viewpump)
}