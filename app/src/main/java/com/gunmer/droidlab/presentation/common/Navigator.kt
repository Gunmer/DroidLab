package com.gunmer.droidlab.presentation.common

import android.app.Activity
import android.content.Context
import android.content.Intent

class Navigator {
    lateinit var context: Context

    fun <T : Activity> navigateTo(activityClass: Class<T>) {
        val intent = Intent(context, activityClass)
        context.startActivity(intent)
    }

}
