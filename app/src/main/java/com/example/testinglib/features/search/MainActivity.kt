package com.example.testinglib.features.search

import android.os.Bundle
import com.example.eventslibrary.model.Events
import com.example.testinglib.app.EventApplication
import com.example.testinglib.features.IActivityCallback
import com.example.testinglib.features.joinleave.JoinLeaveFragment
import com.example.testinglib.R
import com.example.testinglib.app.components.AppComponent
import com.example.testinglib.base.BaseActivity

class MainActivity : BaseActivity(), IActivityCallback {

    private val appComponent: AppComponent by lazy {
        (application as EventApplication).appComponent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        setContentView(R.layout.activity_main)
        swapFragment(SearchFragment(),false)
    }

    override fun getContainerViewId(): Int {
        return R.id.frame_container
    }

    override fun goToDetails(eventInfo: Events) {
        swapFragment(JoinLeaveFragment.newInstance(eventInfo= eventInfo),false)
    }
}
