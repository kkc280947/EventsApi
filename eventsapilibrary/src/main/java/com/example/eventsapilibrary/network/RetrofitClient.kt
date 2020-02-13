package com.example.eventsapilibrary.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient{

    const val BASE_URL: String = "https://private-anon-d8aa01fa6e-tmpz.apiary-mock.com"

    fun create(): EventApi {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return retrofit.create(EventApi::class.java)
    }
}