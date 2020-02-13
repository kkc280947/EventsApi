package com.example.testinglib.app.components

import com.example.testinglib.app.modules.datamodule.DataModule
import com.example.testinglib.app.modules.viewmodelmodule.ViewModelModule
import com.example.testinglib.features.joinleave.JoinLeaveFragment
import com.example.testinglib.features.search.MainActivity
import com.example.testinglib.features.search.SearchFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ViewModelModule::class, DataModule::class]
)
interface AppComponent{
    fun inject(mainActivity: MainActivity)
    fun inject(searchFragment: SearchFragment)
    fun inject(joinLeaveFragment: JoinLeaveFragment)
}