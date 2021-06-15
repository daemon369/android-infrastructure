package me.daemon.plugin

object Libraries {

    private const val kotlinVersion = "1.4.32"
    private const val coreVersion = "1.5.0"
    private const val appCompatVersion = "1.3.0"
    private const val gradlePluginVersion = "4.1.2"

    object A {
        const val gradle = "com.android.tools.build:gradle:$gradlePluginVersion"
    }

    object X {
        const val core = "androidx.core:core:$coreVersion"
        const val coreKtx = "androidx.core:core-ktx:$coreVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    }

    object K {
        const val std = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val coroutines = ""
    }

    object T {
        const val junit = "junit:junit:4.13.2"
        const val xJunit = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
    }

}