package com.nenartovich.example020_dynamicfragmentsimpleproject

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class OtherFragment : ListFragment() {
    private val items = arrayOf("lorem", "ipsum", "dolor",
            "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi",
            "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam",
            "vel", "erat", "placerat", "ante", "porttitor", "sodales",
            "pellentesque", "augue", "purus")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listAdapter = ArrayAdapter<String>(activity!!, android.R.layout.simple_list_item_1, items)
    }
}