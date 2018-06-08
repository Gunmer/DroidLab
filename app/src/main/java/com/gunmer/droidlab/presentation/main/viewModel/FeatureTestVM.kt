package com.gunmer.droidlab.presentation.main.viewModel

import android.databinding.BaseObservable
import android.databinding.ObservableField
import android.view.View

class FeatureTestVM : BaseObservable() {
    val name = ObservableField<String>()
    var action: (() -> Unit)? = null

    @Suppress("UNUSED_PARAMETER")
    fun onClickButton(view: View?) {
        action?.invoke()
    }
}