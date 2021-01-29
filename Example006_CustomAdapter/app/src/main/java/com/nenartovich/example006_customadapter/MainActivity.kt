package com.nenartovich.example006_customadapter

import android.annotation.SuppressLint
import android.app.ListActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MainActivity : ListActivity() {
    private val items = arrayOf("lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listAdapter = IconicAdapter()
    }

    inner class IconicAdapter() : ArrayAdapter<String>(this@MainActivity, R.layout.row, R.id.label, items) {
        @SuppressLint("SetTextI18n")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val row = super.getView(position, convertView, parent)
            var holder = row.tag
            if (holder == null) {
                holder = ViewHolder(row)
                row.tag = holder
            }

            if (items[position].length > 4) {
                (holder as ViewHolder).icon.setImageResource(R.drawable.ok)
            } else {
                (holder as ViewHolder).icon.setImageResource(R.drawable.delete)
            }

            holder.size.text = "${getString(R.string.size_template)} ${items[position].length}"
            return row
        }
    }
}