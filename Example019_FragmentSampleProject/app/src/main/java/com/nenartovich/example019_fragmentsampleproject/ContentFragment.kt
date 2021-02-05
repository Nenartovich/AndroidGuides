package com.nenartovich.example019_fragmentsampleproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ContentFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val result = inflater.inflate(R.layout.mainfrag, container, false)
        result.findViewById<Button>(R.id.showOther).setOnClickListener(this)
        return result
    }

    override fun onClick(v: View?) {
        (activity as MainActivity).showOther()
    }
}