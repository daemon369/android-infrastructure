package me.daemon.infrastructure.file

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File

class FileProvider : FileProvider()

fun Context.fileToUri(file: File): Uri =
        FileProvider.getUriForFile(this, "$packageName.daemon.fileprovider", file)