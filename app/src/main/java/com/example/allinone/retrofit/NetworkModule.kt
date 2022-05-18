package com.example.allinone.retrofit

import com.example.allinone.LoginRetrofitService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// @Module informs Dagger that this class is a Dagger Module Note: You can use the
// @Provides annotation in Dagger modules to tell Dagger how to provide classes that your project doesn't own (e.g. an instance of Retrofit).
@Module
class NetworkModule {

    var baseUrl = "https://api.github.com/search/"   /*repositories?q=network*/


    @Singleton
    @Provides
    fun provideRetrofitService(retrofit: Retrofit): LoginRetrofitService {
        return retrofit.create(LoginRetrofitService::class.java)
    }

    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. LoginRetrofitService).
    // Function parameters are the dependencies of this type.
    @Singleton
    @Provides
    fun getRetrofit(): Retrofit {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}