package com.example.fifausersearchservice.di

import android.app.Application
import com.example.fifausersearchservice.di.module.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FOSApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@FOSApplication)

            modules(
                listOf(
                    mainModule
                )
            )
        }
    }
}