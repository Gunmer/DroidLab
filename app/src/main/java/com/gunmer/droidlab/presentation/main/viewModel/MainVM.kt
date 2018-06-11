package com.gunmer.droidlab.presentation.main.viewModel

import android.databinding.BaseObservable
import android.databinding.ObservableField
import com.gunmer.droidlab.presentation.common.Navigator
import com.gunmer.droidlab.presentation.interfaceOriented.InterfaceOrientedActivity
import com.gunmer.droidlab.presentation.main.adapter.FeatureTestAdapter

class MainVM : BaseObservable() {

    lateinit var navigator: Navigator

    val featureTestAdapter = ObservableField<FeatureTestAdapter>()

    fun onCreate() {

        val interfaceOriented = FeatureTestVM().apply {
            name.set("Interface Oriented")
            action = {
                navigator.navigateTo(InterfaceOrientedActivity::class.java)
            }
        }

        val features = listOf(interfaceOriented)
        featureTestAdapter.set(FeatureTestAdapter(features))
    }

}
