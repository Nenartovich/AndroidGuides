package com.nenartovich.example018_walkingthroughtheactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "MY_TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate(): ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart(): ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart(): ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause(): ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop(): ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy(): ")
    }
}