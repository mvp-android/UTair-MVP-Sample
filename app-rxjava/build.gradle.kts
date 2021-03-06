plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Build.Versions.compileSdk)
    buildToolsVersion(Build.Versions.buildTools)

    defaultConfig {
        applicationId = "com.utair"
        minSdkVersion(Build.Versions.minSdk)
        targetSdkVersion(Build.Versions.targetSdk)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        multiDexEnabled = true
    }

    buildFeatures.viewBinding = true

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    api(project(":core"))

    kapt("com.arello-mobile:moxy-compiler:1.5.5")
    kapt("com.google.dagger:dagger-compiler:2.29.1")
    implementation("com.google.dagger:dagger:2.29.1")

    implementation("io.reactivex.rxjava2:rxjava:2.2.2")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.0")
    implementation("io.reactivex.rxjava2:rxkotlin:2.0.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.3.0")

    // unit-tests
    testImplementation(Dependencies.Tests.kotlinReflect)
    testImplementation(kotlin(Dependencies.Tests.stdJdk))

    testImplementation(Dependencies.Tests.spek)
    testImplementation(Dependencies.Tests.spekRunner)
    testImplementation(Dependencies.Tests.mockk)
    testImplementation(Dependencies.Tests.strikt)

    testImplementation(Dependencies.Tests.okhttpMockServer)
}
