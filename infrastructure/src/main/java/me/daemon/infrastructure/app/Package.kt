package me.daemon.infrastructure.app

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import me.daemon.annotation.RequireInfrastructureApp
import me.daemon.infrastructure.application
import me.daemon.infrastructure.file.fileToUri
import java.io.File

/**
 * @author daemon
 * @since 2021/6/20 19:30
 */


/**
 * install package from local file
 *
 * [android.Manifest.permission.REQUEST_INSTALL_PACKAGES] is required
 */
fun Context.installPackage(file: File) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

    val uri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        fileToUri(file)
    } else {
        Uri.fromFile(file)
    }

    intent.setDataAndType(uri, "application/vnd.android.package-archive")
    startActivity(intent)
}

/**
 * install package from local file
 *
 * [android.Manifest.permission.REQUEST_INSTALL_PACKAGES] is required
 */
fun Context.installPackage(filePath: String) = installPackage(File(filePath))

/**
 * install package from local file
 *
 * [android.Manifest.permission.REQUEST_INSTALL_PACKAGES] is required
 *
 * @receiver apk file
 */
@RequireInfrastructureApp
fun File.installPackage() = application.installPackage(this)


/**
 * install package from local file
 *
 * [android.Manifest.permission.REQUEST_INSTALL_PACKAGES] is required
 *
 * @receiver path of apk file
 */
@RequireInfrastructureApp
fun String.installPackage() = application.installPackage(this)