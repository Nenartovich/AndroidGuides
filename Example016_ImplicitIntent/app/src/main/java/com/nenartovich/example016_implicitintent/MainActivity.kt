package com.nenartovich.example016_implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMe(v: View?) {
        val url = findViewById<EditText>(R.id.url)
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url.text.toString()) ))
    }
}