plugins {
    id("com.android.library")
    id("kotlin-android")
}

ext {
    set("artifactId", "android-infrastructure")
    set("artifactVersion", "0.3.0")

    set(
        "pom",
        mapOf(
            "name" to get("artifactId"),
            "description" to "Android infrastructure",
            "url" to "https://github.com/daemon369/android-infrastructure",
            "scm" to mapOf(
                "connection" to "scm:git:git://github.com/daemon369/android-infrastructure.git",
                "developerConnection" to "scm:git:ssh://github.com/daemon369/android-infrastructure.git",
                "url" to "https://github.com/daemon369/android-infrastructure/tree/main",
            )
        )
    )
}

apply(from = "$rootDir/gradle/library_base.gradle")
apply(from = "$rootDir/gradle/maven-publish.gradle")

android {
    buildFeatures {
        buildConfig = false
    }
}

dependencies {
    compileOnly(libs.x.core)
    implementation("io.github.daemon369:annotation:0.1.0")
    implementation("io.github.daemon369:android-infrastructure-application:1.2.0")
//    implementation project(":annotation")
}