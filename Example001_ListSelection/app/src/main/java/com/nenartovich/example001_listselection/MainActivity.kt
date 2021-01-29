package com.nenartovich.example001_listselection

import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.ArrayAdapter
import android.app.ListActivity
import android.view.View

class MainActivity : ListActivity() {
    private lateinit var selection: TextView
    val strings = arrayOf("lorem", "ipsum", "dolor",
        "sit", "amet",
        "consectetuer", "adipiscing", "elit", "morbi", "vel",
        "ligula", "vitae", "arcu", "aliquet", "mollis",
        "etiam", "vel", "erat", "placerat", "ante",
        "porttitor", "sodales", "pellentesque", "augue", "purus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selection = findViewById(R.id.tvSelection)
        listAdapter = ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, strings)
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        selection.text = strings[position]
    }
}