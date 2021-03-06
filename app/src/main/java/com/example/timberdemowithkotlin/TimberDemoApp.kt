package com.example.timberdemowithkotlin

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

class TimberDemoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(DebugTree())
    }
}