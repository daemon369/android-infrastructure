includeBuild("compositeBuild")
include(":infrastructure")
include(":annotation")
include(":demo")
rootProject.name = "android-infrastructure"


enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases/") }
    }
    versionCatalogs {
        create("libs") {
            from("io.github.daemon369:android-version-catalog:0.0.8")
        }
    }
}