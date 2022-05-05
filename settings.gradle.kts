@file:Suppress("UnstableApiUsage")

includeBuild("compositeBuild")
include(":infrastructure")
include(":demo")
rootProject.name = "android-infrastructure"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases/") }
    }
    versionCatalogs {
        create("libs") {
            from("io.github.daemon369:android-version-catalog:1.2.0")
        }
    }
}