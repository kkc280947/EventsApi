package com.example.testinglib.features

import com.example.eventslibrary.model.Events

interface IActivityCallback {

    fun goToDetails(eventInfo: Events)
}