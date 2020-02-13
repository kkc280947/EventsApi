package com.example.testinglib.app

import android.app.Application
import com.example.testinglib.app.components.AppComponent
import com.example.testinglib.app.components.DaggerAppComponent

class EventApplication: Application(){

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .build()
    }
}