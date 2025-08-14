package com.awesomeapp.search.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.search.Viewmodel12_1
import com.awesomeapp.search.Activity12_2
import com.awesomeapp.search.Activity12_3
import com.awesomeapp.search.Fragment12_4
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.search.Api12_6
import com.awesomeapp.search.Usecase12_7
import com.awesomeapp.search.Model12_9
import com.awesomeapp.search.Model12_10
import com.awesomeapp.search.Activity12_11
import com.awesomeapp.search.Model12_13
import com.awesomeapp.search.Activity12_14

@Module
@InstallIn(SingletonComponent::class)
object Module_12 {
    @Provides
    @Singleton
    fun provideRepository12_5(): Repository12_5 {
        return Repository12_5()
    }

    @Provides
    @Singleton
    fun provideApi12_6(): Api12_6 {
        return Api12_6()
    }
}