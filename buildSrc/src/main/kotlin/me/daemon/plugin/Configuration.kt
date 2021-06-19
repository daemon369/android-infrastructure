package me.daemon.plugin

object Configuration {
    const val minSdkVersion = 19
    const val compileSdkVersion = 30
    const val targetSdkVersion = 29
    const val buildToolsVersion = "30.0.3"
    const val groupId = "io.github.daemon369"
    const val artifactId = "android-infrastructure"
    const val version = "0.1.1"

    @Suppress("ClassName")
    object pom {
        const val name = artifactId
        const val description = "Android infrastructure"
        const val url = "https://github.com/daemon369/android-infrastructure"

        @Suppress("ClassName")
        object scm {
            const val connection = "scm:git:github.com/daemon369/android-infrastructure.git"
            const val developerConnection = "scm:git:ssh://github.com/daemon369/android-infrastructure.git"
            const val url = "https://github.com/daemon369/android-infrastructure/tree/main"
        }
    }
}