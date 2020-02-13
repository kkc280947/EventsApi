package com.example.eventsapilibrary

import com.example.eventslibrary.model.Events
import org.junit.Assert
import org.junit.Test

class EventsApiTestCases{
    @Test
    fun testQuery(){

        //
        val listItems: MutableList<Events> = EventLib.searchForEvent("movie")
        val listItemInt: MutableList<Events> = EventLib.searchForEvent("1234")

        Assert.assertEquals(listItems.size, 1)
        Assert.assertEquals(listItemInt.size, 0)
    }

    @Test
    fun testJoinEvent(){
        val listItems: MutableList<Events> = EventLib.searchForEvent("movie")
        val id = listItems[0].id
        assert(EventLib.joinForEvent(id.toString()))
    }

    @Test
    fun testLeaveEvent(){
        val listItems: MutableList<Events> = EventLib.searchForEvent("movie")
        val id = listItems[0].id
        assert(EventLib.leaveEvent(id.toString()))
    }

    @Test
    fun testIntQuery(){
        val listItemInt: MutableList<Events> = EventLib.searchForEvent("1234")
        Assert.assertEquals(listItemInt.size, 0)
    }
}