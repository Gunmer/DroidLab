package com.gunmer.droidlab.infrastructure

import android.app.Activity

val Activity.app: App
    get() = application as App
