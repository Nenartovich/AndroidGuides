package com.nenartovich.example013_recyclerview_visualimpact2

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.os.Build
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

@SuppressLint("ClickableViewAccessibility")
class RowController(row: View) : RecyclerView.ViewHolder(row), View.OnClickListener {
    var label: TextView? = null
    var size:  TextView? = null
    var icon:  ImageView? = null
    var template: String? = null
    init {
        label = row.findViewById(R.id.label)
        size = row.findViewById(R.id.size)
        icon = row.findViewById(R.id.icon)
        template = size!!.context.getString(R.string.size_templete)
        row.setOnClickListener(this)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            row.setOnTouchListener { v, event ->
                v!!.findViewById<LinearLayout>(R.id.row_content)!!.background!!.setHotspot(event!!.x, event.y)
                false
            }
        }
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

    override fun onClick(v: View) {
        Toast.makeText(
            v.context,
            String.format("Clicked on position %d", adapterPosition),
            Toast.LENGTH_SHORT
        ).show()
    }
}