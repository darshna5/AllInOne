package com.example.allinone

import com.example.allinone.model.ListResp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LoginRetrofitService {
    @GET("repositories")
    fun getApiData(@Query("q")q:String): Call<ListResp>
}