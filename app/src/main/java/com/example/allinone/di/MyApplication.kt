package com.example.allinone.di

import android.app.Application

// appComponent lives in the Application class to share its lifecycle
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Reference to the application graph that is used across the whole app
        //val appComponent = DaggerAppComponent.create()

    }

}