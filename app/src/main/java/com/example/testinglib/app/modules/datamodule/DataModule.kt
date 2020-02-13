package com.example.testinglib.app.modules.datamodule

import com.example.testinglib.features.search.SearchRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule{

    @Provides
    @Singleton
    fun provideSearchRepository(): SearchRepository {
        return SearchRepository()
    }
}