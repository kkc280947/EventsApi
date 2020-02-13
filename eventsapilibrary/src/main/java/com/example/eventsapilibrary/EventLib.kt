package com.example.eventsapilibrary

import com.example.eventsapilibrary.network.RetrofitClient
import com.example.eventslibrary.model.Events

class EventLib{

    companion object{
        fun searchForEvent(query: String): MutableList<Events> {
            val eventsList = mutableListOf<Events>()
            val body =
                RetrofitClient.create().getEventsList(query).execute()
            if(body.isSuccessful){
                val dataResponse = body.body() as MutableList<Events>
                if(dataResponse.isNotEmpty()){
                    for (events in  dataResponse){
                        if(events.title.startsWith(query,true)){
                            eventsList.add(events)
                        }
                    }
                }
            }
            return eventsList
        }

        fun joinForEvent(id: String): Boolean{
            val body =
                RetrofitClient.create().joinEvent(id).execute()
            if(body.isSuccessful && body.code() == 200){
                return true
            }
            return false
        }

        fun leaveEvent(id: String): Boolean{
            val body =
                RetrofitClient.create().leaveEvent(id).execute()
            if(body.isSuccessful && body.code() == 200){
                return true
            }
            return false
        }
    }
}