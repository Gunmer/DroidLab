package com.gunmer.droidlab.presentation.common

import android.databinding.BindingAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

@BindingAdapter(value = ["app:adapter", "app:layoutManager"], requireAll = false)
fun RecyclerView.setAdapter(adapter: RecyclerView.Adapter<*>, layoutManager: RecyclerView.LayoutManager? = null) {
    this.layoutManager = layoutManager ?: LinearLayoutManager(context)
    this.adapter = adapter
}
