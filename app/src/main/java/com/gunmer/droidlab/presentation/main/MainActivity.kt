package com.gunmer.droidlab.presentation.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gunmer.droidlab.R
import com.gunmer.droidlab.databinding.ActivityMainBinding
import com.gunmer.droidlab.presentation.main.viewModel.MainVM

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = MainVM()

        binding.viewModel?.onCreate()
    }

}
