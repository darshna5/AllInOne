package com.example.allinone.di

import com.example.allinone.MainActivityViewModel
import com.example.allinone.SecondActivity
import com.example.allinone.UserRepository
import com.example.allinone.retrofit.NetworkModule
import dagger.Component

// Definition of the Application graph means responsible to create graph of all
// requested dependencies/classes injected by any class Because certain Android framework classes such as activities and fragments are instantiated by the system, Dagger can't create them for you. For activities specifically, any initialization code needs to go into the onCreate() method.
// That means you cannot use the @Inject annotation in the constructor of the class (constructor injection)
// for activity and fragment we use filed annotation due to above reason

// The "modules" attribute in the @Component annotation tells Dagger what Modules
// to include when building the graph
@Component(modules = [NetworkModule::class])
//@Component
interface RetroComponent {
    fun inject(mainActivityViewModel: MainActivityViewModel)

}