package com.nenartovich.example017_intentextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showOther(v: View?) {
        val intent = Intent(this, OtherActivity::class.java)
        intent.putExtra("hello_key", "Hello from MainActivity!")
        startActivity(intent)
    }
}