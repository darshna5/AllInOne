package com.example.allinone

import android.app.Application
import com.example.allinone.di.DaggerRetroComponent
import com.example.allinone.di.RetroComponent
import com.example.allinone.di.RetroModule

class MyApplication: Application() {

    private lateinit var retroComponent: RetroComponent

    override fun onCreate() {
        super.onCreate()

        retroComponent = DaggerRetroComponent.builder()
            .retroModule(RetroModule())
            .build()
    }

    fun getRetroComponent(): RetroComponent {
        return retroComponent
    }
}