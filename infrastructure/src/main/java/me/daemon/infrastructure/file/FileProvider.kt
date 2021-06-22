package me.daemon.infrastructure.file

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import me.daemon.annotation.RequireInfrastructureApp
import me.daemon.infrastructure.application
import java.io.File

@Suppress("SpellCheckingInspection")
private const val authoritySuffix = ".daemon.fileprovider"

class FileProvider : FileProvider()

val Context.authority
    get() = "$packageName$authoritySuffix"

fun Context.fileToUri(file: File): Uri =
        FileProvider.getUriForFile(this, authority, file)

@RequireInfrastructureApp
val authority
    get() = application.authority

@RequireInfrastructureApp
fun File.fileToUri(): Uri = application.fileToUri(this)