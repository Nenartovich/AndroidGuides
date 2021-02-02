package com.nenartovich.example011_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : RecyclerViewActivity() {

    val items = arrayOf("lorem", "ipsum", "dolor",
        "sit", "amet",
        "consectetuer", "adipiscing", "elit", "morbi", "vel",
        "ligula", "vitae", "arcu", "aliquet", "mollis",
        "etiam", "vel", "erat", "placerat", "ante",
        "porttitor", "sodales", "pellentesque", "augue", "purus")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayoutManager(LinearLayoutManager(this))
        setAdapter(IconicAdapter())
    }

    inner class IconicAdapter : RecyclerView.Adapter<RowHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder
            = RowHolder(layoutInflater.inflate(R.layout.row, parent, false))

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: RowHolder, position: Int) {
            holder.bindModel(items[position])
        }

    }


    class RowHolder(row: View) : RecyclerView.ViewHolder(row) {
        var label: TextView? = null
        var size:  TextView? = null
        var icon:  ImageView? = null
        var template: String? = null
        init {
            label = row.findViewById(R.id.label)
            size = row.findViewById(R.id.size)
            icon = row.findViewById(R.id.icon)
            template = size!!.context.getString(R.string.size_templete)
        }

        fun bindModel(item: String) {
            label!!.text = item
            size!!.text = String.format(template!!, item.length)
            if (item.length > 4) {
                icon!!.setImageResource(R.drawable.ok)
            } else {
                icon!!.setImageResource(R.drawable.delete)
            }

        }
    }
}