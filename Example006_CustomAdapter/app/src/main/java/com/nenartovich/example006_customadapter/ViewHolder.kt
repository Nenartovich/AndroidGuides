package com.nenartovich.example006_customadapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ViewHolder(row: View) {
    var icon: ImageView = row.findViewById(R.id.icon)
    var size: TextView = row.findViewById(R.id.size)
}