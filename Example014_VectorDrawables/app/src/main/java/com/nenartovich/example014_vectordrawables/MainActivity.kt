package com.nenartovich.example014_vectordrawables

import android.app.ListActivity
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MainActivity : ListActivity() {
    private val VECTORS = arrayOf(
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_corp_icon_badge,
            R.drawable.ic_eject_24dp,
            R.drawable.ic_sd_card_48dp)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listAdapter = VectorAdapter()
    }

    inner class VectorAdapter : ArrayAdapter<Int>(this, R.layout.row, R.id.title, VECTORS ) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val row = super.getView(position, convertView, parent)
            val icon = row.findViewById<ImageView>(R.id.icon)
            row.findViewById<TextView>(R.id.title)
            applyIcon(icon, getItem(position))
            return row
        }
    }

    fun applyIcon(icon: ImageView, resourceId: Int?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            icon.setImageResource(resourceId!!)
        }
    }
}