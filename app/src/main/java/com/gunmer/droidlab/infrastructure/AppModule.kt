package com.gunmer.droidlab.infrastructure

import android.content.Context
import com.gunmer.droidlab.presentation.common.Navigator
import com.gunmer.droidlab.presentation.common.NavigatorDefault
import com.gunmer.droidlab.presentation.main.viewModel.MainVM
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(var app: App) {

    @Provides
    @Singleton
    fun provideApp() = app

    @Provides
    fun provideContext(app: App) = app as Context

    @Provides
    fun provideNavigator(context: Context): Navigator {
        return NavigatorDefault().apply {
            this.context = context
        }
    }

    @Provides
    fun provideMainVM(navigator: Navigator): MainVM {
        return MainVM().apply {
            this.navigator = navigator
        }
    }

}
