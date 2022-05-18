package com.example.allinone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.allinone.di.MyApplication
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    // You want Dagger to provide an instance of LoginViewModel from the graph
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // Make Dagger instantiate @Inject fields in LoginActivity
        //(applicationContext as MyApplication).appComponent.inject(this)
        // Now loginViewModel is available
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }
}