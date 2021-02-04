package com.nenartovich.example017_intentextras

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_activity)
        val textValue = intent.getStringExtra("hello_key")
        val tv = findViewById<TextView>(R.id.textView)
        tv.text = textValue
    }




}