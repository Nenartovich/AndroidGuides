package com.nenartovich.example007_webviewloadurlmethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browser = findViewById<WebView>(R.id.vwBrowser)
        browser.loadUrl("https://commonsware.com")

//        browser.loadData("<html><body>Hello, world!</body></html>",
//                "text/html; charset=UTF-8", null)
    }
}