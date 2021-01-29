package com.nenartovich.example003_spinnersampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private val strings = arrayOf("lorem", "ipsum", "dolor",
        "sit", "amet",
        "consectetuer", "adipiscing", "elit", "morbi", "vel",
        "ligula", "vitae", "arcu", "aliquet", "mollis",
        "etiam", "vel", "erat", "placerat", "ante",
        "porttitor", "sodales", "pellentesque", "augue", "purus")

    private lateinit var selection: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selection = findViewById(R.id.tvSelection)
        val spinner = findViewById<Spinner>(R.id.sSpinner)
        spinner.onItemSelectedListener = this

        val aa = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strings)
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = aa
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        selection.text = ""
    }

    override fun onItemSelected(parent: AdapterView<*>?, v: View?, position: Int, id: Long) {
        selection.text = strings[position]
    }
}