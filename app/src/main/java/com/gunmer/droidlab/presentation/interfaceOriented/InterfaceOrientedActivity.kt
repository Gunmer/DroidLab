package com.gunmer.droidlab.presentation.interfaceOriented

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gunmer.droidlab.R
import com.gunmer.droidlab.databinding.ActivityInterfaceOrientedBinding

class InterfaceOrientedActivity : AppCompatActivity() {

    companion object {
        fun startIntent(context: Context): Intent {
            return Intent(context, InterfaceOrientedActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityInterfaceOrientedBinding>(this, R.layout.activity_interface_oriented)
    }

}
