package com.nenartovich.example012_recyclerview_visualimpact1
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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

        val divider = resources.getDrawable(R.drawable.item_divider)
        getRecyclerView()
            .addItemDecoration( HorizontalDividerItemDecoration(divider))
        setAdapter(IconicAdapter())

    }

    inner class IconicAdapter : RecyclerView.Adapter<RowController>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowController
            = RowController(layoutInflater.inflate(R.layout.row, parent, false))

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: RowController, position: Int) {
            holder.bindModel(items[position])
        }

    }

}