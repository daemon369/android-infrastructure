plugins {
    id("com.android.application")
    id("kotlin-android")
}

apply(from = "$rootDir/gradle/base.gradle")

android {
    defaultConfig {
        applicationId = "me.deamon.infrastructure.demo"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.x.appcompat)
    implementation(libs.x.constraintlayout)

    implementation(project(":infrastructure"))
    implementation("io.github.daemon369:android-infrastructure-application:1.1.0")
}