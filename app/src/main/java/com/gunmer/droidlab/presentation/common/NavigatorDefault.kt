package com.gunmer.droidlab.presentation.common

import android.app.Activity
import android.content.Context
import android.content.Intent

class NavigatorDefault : Navigator {

    lateinit var context: Context

    override fun <T : Activity> navigateTo(activityClass: Class<T>) {
        val intent = Intent(context, activityClass)
        context.startActivity(intent)
    }

    override fun navigateTo(startIntent: Intent) {
        context.startActivity(startIntent)
    }

}
