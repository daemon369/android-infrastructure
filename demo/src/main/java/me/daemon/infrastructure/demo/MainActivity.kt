package me.daemon.infrastructure.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import me.daemon.infrastructure.file.fileToUri
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val file = File(getExternalFilesDir("abc"), "def")
        val uri = fileToUri(file)
        Log.e("MainActivity", "uri=$uri")
    }
}