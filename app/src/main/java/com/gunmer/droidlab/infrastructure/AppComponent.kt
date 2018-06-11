package com.gunmer.droidlab.infrastructure

import com.gunmer.droidlab.presentation.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: App)
    fun inject(activity: MainActivity)
}