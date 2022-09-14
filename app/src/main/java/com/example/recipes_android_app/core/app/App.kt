package com.example.recipes_android_app.core.app

import android.app.Application
import com.example.recipes_android_app.core.di.koinInjector
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        //initialization of Koin
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@App) //pass application context
            modules(koinInjector) //define modules
        }
    }
}