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

@Deprecated(
    message = "use me.daemon.infrastructure.application.debuggable instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.debuggable")
)
val Context.debuggable: Boolean
    get() = me.daemon.infrastructure.application.debuggable

@Deprecated(
    message = "use me.daemon.infrastructure.application.packageInfo instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.packageInfo")
)
val Context.packageInfo: PackageInfo
    get() = me.daemon.infrastructure.application.packageInfo

@Deprecated(
    message = "use me.daemon.infrastructure.application.versionCode instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.versionCode")
)
@Suppress("DEPRECATION")
val Context.versionCode: Int
    get() = me.daemon.infrastructure.application.versionCode

@Deprecated(
    message = "use me.daemon.infrastructure.application.longVersionCode instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.longVersionCode")
)
val Context.longVersionCode: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = me.daemon.infrastructure.application.longVersionCode

@Deprecated(
    message = "use me.daemon.infrastructure.application.versionName instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.versionName")
)
val Context.versionName: String
    get() = me.daemon.infrastructure.application.versionName

@Deprecated(
    message = "use me.daemon.infrastructure.application.debuggable instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.debuggable")
)
@RequireInfrastructureApp
val debuggable: Boolean
    get() = me.daemon.infrastructure.application.debuggable

@Deprecated(
    message = "use me.daemon.infrastructure.application.packageInfo instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.packageInfo")
)
@RequireInfrastructureApp
val packageInfo: PackageInfo
    get() = me.daemon.infrastructure.application.packageInfo

@Deprecated(
    message = "use me.daemon.infrastructure.application.versionCode instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.versionCode")
)
@RequireInfrastructureApp
@Suppress("unused")
val versionCode: Int
    get() = me.daemon.infrastructure.application.versionCode

@Deprecated(
    message = "use me.daemon.infrastructure.application.longVersionCode instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.longVersionCode")
)
@Suppress("unused")
@RequireInfrastructureApp
val longVersionCode: Long
    @RequiresApi(Build.VERSION_CODES.P)
    get() = me.daemon.infrastructure.application.longVersionCode

@Deprecated(
    message = "use me.daemon.infrastructure.application.versionName instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.versionName")
)
@Suppress("unused")
@RequireInfrastructureApp
val versionName: String
    get() = me.daemon.infrastructure.application.versionName

@Deprecated(
    message = "use me.daemon.infrastructure.application.packageName instead",
    replaceWith = ReplaceWith("me.daemon.infrastructure.application.packageName")
)
@RequireInfrastructureApp
@Suppress("unused")
val packageName: String
    get() = me.daemon.infrastructure.application.packageName
