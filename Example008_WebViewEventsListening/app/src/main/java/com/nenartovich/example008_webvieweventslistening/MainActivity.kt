package com.nenartovich.example008_webvieweventslistening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateUtils
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var browser :WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        browser = findViewById(R.id.vwBrowser)
        browser.webViewClient = Callback()
        loadTime()
    }

    private fun loadTime() {
        val page = "<html><body><a href='https://commonsware.com/'>" +
                DateUtils.formatDateTime(this, Date().time,
                                        DateUtils.FORMAT_SHOW_DATE) +
                                        "</a></body></html>"
        browser.loadData(page, "text/html; charset=UTF-8", null)
    }

    inner class Callback : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            loadTime()
            return true
        }
    }
}

