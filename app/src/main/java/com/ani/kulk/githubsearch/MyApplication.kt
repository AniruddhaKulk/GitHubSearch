package com.ani.kulk.githubsearch

import android.app.Application
import com.ani.kulk.githubsearch.di.networkModule
import com.ani.kulk.githubsearch.di.useCaseModules
import com.ani.kulk.githubsearch.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(useCaseModules, networkModule, viewModelModules))
        }
    }
}