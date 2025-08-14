package com.awesomeapp.networklogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networklogin.Viewmodel112_1
import com.awesomeapp.networklogin.Activity112_2
import com.awesomeapp.networklogin.Activity112_3
import com.awesomeapp.networklogin.Fragment112_4
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.networklogin.Model112_8
import com.awesomeapp.networklogin.Model112_9
import com.awesomeapp.networklogin.Activity112_10
import com.awesomeapp.networklogin.Model112_12
import com.awesomeapp.networklogin.Activity112_13

@Module
@InstallIn(SingletonComponent::class)
object Module_112 {
    @Provides
    @Singleton
    fun provideRepository112_5(): Repository112_5 {
        return Repository112_5()
    }

    @Provides
    @Singleton
    fun provideApi112_6(): Api112_6 {
        return Api112_6()
    }
}