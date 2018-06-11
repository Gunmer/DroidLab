package com.gunmer.droidlab.presentation.common

import android.app.Activity
import android.content.Intent

interface Navigator {

    fun <T : Activity> navigateTo(activityClass: Class<T>)
    fun navigateTo(startIntent: Intent)

}
