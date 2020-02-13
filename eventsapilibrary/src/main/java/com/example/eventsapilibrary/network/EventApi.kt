package com.example.eventsapilibrary.network

import com.example.eventslibrary.model.AuthModelClass
import com.example.eventslibrary.model.Events
import retrofit2.Call
import retrofit2.http.*

interface EventApi{

    @Headers("Authorization: Basic aDFFs87201jskfna818rfyeia917=")
    @GET("/v1/auth/token")
    fun getToken(): Call<AuthModelClass>

    @Headers("Authorization: Bearer e3e4db4432d6f93905f705e53a4898087920b6e71b0ffc4b5451924361c3e86b")
    @GET("/v1/events/search")
    fun getEventsList(@Query("q") query: String): Call<MutableList<Events>>

    @GET("v1/events/{event_id}/join")
    fun joinEvent(@Path("event_id") event_id: String): Call<Void>

    @GET("v1/events/{event_id}/leave")
    fun leaveEvent(@Path("event_id") event_id: String): Call<Void>
}