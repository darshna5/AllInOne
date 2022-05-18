package com.example.allinone

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import javax.inject.Inject

// @Inject tells Dagger how to create instances of LoginViewModel
class MainActivityViewModel(application: Application) :AndroidViewModel(application){
    @Inject lateinit var loginRetrofitService: LoginRetrofitService

}