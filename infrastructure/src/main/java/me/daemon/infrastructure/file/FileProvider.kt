package me.daemon.infrastructure.file

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import me.daemon.annotation.RequireInfrastructureApp
import me.daemon.infrastructure.application.application
import java.io.File

@Suppress("SpellCheckingInspection")
private const val fileProviderAuthoritySuffix = ".daemon.fileprovider"

class FileProvider : FileProvider()

val Context.fileProviderAuthority
    get() = "$packageName$fileProviderAuthoritySuffix"

@Deprecated(
        message = "use Context.fileProviderAuthority instead, will be removed in 1.0.0",
        replaceWith = ReplaceWith("fileProviderAuthority")
)
val Context.authority
    get() = this.fileProviderAuthority

fun Context.fileToUri(file: File): Uri =
        FileProvider.getUriForFile(this, fileProviderAuthority, file)

@RequireInfrastructureApp
val fileProviderAuthority
    get() = application.fileProviderAuthority

@RequireInfrastructureApp
@Deprecated(
        message = "use fileProviderAuthority instead, will be removed in 1.0.0",
        replaceWith = ReplaceWith("fileProviderAuthority")
)
val authority
    get() = fileProviderAuthority

@RequireInfrastructureApp
fun File.fileToUri(): Uri = application.fileToUri(this)