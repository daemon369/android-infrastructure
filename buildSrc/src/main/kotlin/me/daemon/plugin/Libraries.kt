package me.daemon.plugin

object Libraries {

    /**
     * versions
     */
    @Suppress("ClassName")
    private object v {
        const val kotlin = "1.4.32"
        const val coroutines = "1.4.2"
        const val core = "1.5.0"
        const val appCompat = "1.3.0"
        const val constraintLayout = "2.0.4"
        const val gradlePlugin = "4.1.2"
        const val junit = "4.13.2"
        const val xJunit = "1.1.2"
        const val espresso = "3.3.0"
    }

    /**
     * Android libraries
     */
    object A {
        const val gradle = "com.android.tools.build:gradle:${v.gradlePlugin}"
    }

    /**
     * AndroidX libraries
     */
    object X {
        const val core = "androidx.core:core:${v.core}"
        const val coreKtx = "androidx.core:core-ktx:${v.core}"
        const val appCompat = "androidx.appcompat:appcompat:${v.appCompat}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${v.constraintLayout}"
    }

    /**
     * kotlin libraries
     */
    object K {
        const val std = "org.jetbrains.kotlin:kotlin-stdlib:${v.kotlin}"
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${v.kotlin}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${v.coroutines}"
    }

    /**
     * test libraries
     */
    object T {
        const val junit = "junit:junit:${v.junit}"
        const val xJunit = "androidx.test.ext:junit:${v.xJunit}"
        const val espresso = "androidx.test.espresso:espresso-core:${v.espresso}"
    }

}