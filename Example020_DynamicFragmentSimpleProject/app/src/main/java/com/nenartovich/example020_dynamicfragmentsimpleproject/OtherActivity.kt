package com.nenartovich.example020_dynamicfragmentsimpleproject

import android.os.Bundle

class OtherActivity : LifecycleLoggingActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportFragmentManager.findFragmentById(android.R.id.content) == null) {
            supportFragmentManager.beginTransaction()
                    .add(android.R.id.content, OtherFragment())
                    .commit()
        }
    }
}