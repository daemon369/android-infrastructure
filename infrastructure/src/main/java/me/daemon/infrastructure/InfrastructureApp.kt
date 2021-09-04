package me.daemon.infrastructure

import android.content.Context
import android.content.pm.PackageInfo
import android.os.Build
import androidx.annotation.RequiresApi
import me.daemon.annotation.RequireInfrastructureApp

/**
 * @author daemon
 * @since 2021/6/15 15:26
 */
@Deprecated(
    message = "use me.daemon.infrastructure.application.InfrastructureApp instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.InfrastructureApp")
)
open class InfrastructureApp : me.daemon.infrastructure.application.InfrastructureApp()

/**
 * instance of InfrastructureApp
 */
@RequireInfrastructureApp
@Deprecated(
    message = "use me.daemon.infrastructure.application.application instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.application")
)
@Suppress("DEPRECATION")
val application: InfrastructureApp
    get() = me.daemon.infrastructure.application.application as InfrastructureApp

val Context.debuggable: Boolean
    get() = me.daemon.infrastructure.application.debuggable

val Context.packageInfo: PackageInfo
    get() = me.daemon.infrastructure.application.packageInfo

@Suppress("DEPRECATION")
val Context.versionCode: Int
    get() = me.daemon.infrastructure.application.versionCode

val Context.longVersionCode: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = me.daemon.infrastructure.application.longVersionCode

val Context.versionName: String
    get() = me.daemon.infrastructure.application.versionName

@RequireInfrastructureApp
val debuggable: Boolean
    get() = me.daemon.infrastructure.application.debuggable

@RequireInfrastructureApp
val packageInfo: PackageInfo
    get() = me.daemon.infrastructure.application.packageInfo

@RequireInfrastructureApp
@Suppress("unused")
val versionCode: Int
    get() = me.daemon.infrastructure.application.versionCode

@Suppress("unused")
@RequireInfrastructureApp
val longVersionCode: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = me.daemon.infrastructure.application.longVersionCode

@Suppress("unused")
@RequireInfrastructureApp
val versionName: String
    get() = me.daemon.infrastructure.application.versionName

@RequireInfrastructureApp
@Suppress("unused")
val packageName: String
    get() = me.daemon.infrastructure.application.packageName
