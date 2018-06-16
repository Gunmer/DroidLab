package com.gunmer.droidlab.presentation.interfaceOriented

import android.util.Log

class Logger<T>(private val clazz: Class<T>) {

    fun debug(message: String) {
        Log.d(clazz.simpleName, message)
    }

    interface Loggable {
        val log
            get() = Logger(this.javaClass)
    }

}