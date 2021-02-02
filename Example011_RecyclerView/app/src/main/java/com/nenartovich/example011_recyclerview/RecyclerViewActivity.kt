package com.nenartovich.example011_recyclerview

import android.app.Activity
import androidx.recyclerview.widget.RecyclerView

open class RecyclerViewActivity : Activity() {
    private var rv: RecyclerView? = null

    fun setAdapter(adapter: RecyclerView.Adapter<MainActivity.RowHolder>) {
        getRecyclerView().setAdapter(adapter)
    }

    fun getAdapter() : RecyclerView.Adapter<*>? = getRecyclerView().adapter

    fun setLayoutManager(mgr: RecyclerView.LayoutManager) {
        getRecyclerView().layoutManager = mgr
    }

    fun getRecyclerView() : RecyclerView {
        if (rv == null) {
            rv = RecyclerView(this)
            rv!!.setHasFixedSize(true)
            setContentView(rv)
        }
        return rv!!
    }

}