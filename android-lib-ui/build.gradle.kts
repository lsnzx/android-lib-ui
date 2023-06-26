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
    implementation(libs.glide)
    implementation(libs.airbnb.android.lottie)
    implementation(libs.github.refresh.kernel)
    implementation(libs.github.refresh.header)
    implementation(libs.github.refresh.footer)
    implementation(libs.github.inflationx.calligraphy3)
    implementation("com.github.lsnzx:android-lib-res:1.0.0")
    implementation(libs.github.inflationx.viewpump)

    implementation(libs.material)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.constraintlayout.constraintlayout)
    implementation(libs.androidx.recyclerview.recyclerview)
    implementation(libs.jetbrains.kotlin.reflect)
}