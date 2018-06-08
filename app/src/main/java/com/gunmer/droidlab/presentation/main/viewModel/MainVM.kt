package com.gunmer.droidlab.presentation.main.viewModel

import android.databinding.BaseObservable
import android.databinding.ObservableField
import android.util.Log
import com.gunmer.droidlab.presentation.main.adapter.FeatureTestAdapter

class MainVM : BaseObservable() {

    val featureTestAdapter = ObservableField<FeatureTestAdapter>()

    fun onCreate() {
        val prueba1 = FeatureTestVM().apply {
            name.set("Prueba 1")
            action = {
                Log.d("MainVM", "Action is executed")
            }
        }

        val features = listOf(prueba1)
        featureTestAdapter.set(FeatureTestAdapter(features))
    }

}
