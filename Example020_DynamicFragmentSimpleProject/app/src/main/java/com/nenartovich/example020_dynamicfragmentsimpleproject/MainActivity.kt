package com.nenartovich.example020_dynamicfragmentsimpleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.nextActivity).setOnClickListener(
                object : View.OnClickListener {
                    override fun onClick(p0: View?) {
                        startActivity(Intent(this@MainActivity, OtherActivity::class.java))
                    }
                }
        )
    }
}