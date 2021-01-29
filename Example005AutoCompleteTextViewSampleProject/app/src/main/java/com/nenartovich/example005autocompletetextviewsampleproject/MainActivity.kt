package com.nenartovich.example005autocompletetextviewsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView

class MainActivity : AppCompatActivity(), TextWatcher {
    private lateinit var selection: TextView
    private lateinit var edit: AutoCompleteTextView
    private val items = arrayOf("lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selection = findViewById(R.id.tvSelection)
        edit = findViewById(R.id.actvEdit)
        edit.addTextChangedListener(this)
        edit.setAdapter(ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items))

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        selection.text = edit.text
    }

    override fun afterTextChanged(p0: Editable?) {

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }


}