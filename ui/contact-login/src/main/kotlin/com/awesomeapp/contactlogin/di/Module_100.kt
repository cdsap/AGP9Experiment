package com.awesomeapp.contactlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactlogin.Viewmodel100_1
import com.awesomeapp.contactlogin.Activity100_2
import com.awesomeapp.contactlogin.Activity100_3
import com.awesomeapp.contactlogin.Fragment100_4
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.contactlogin.Service100_7
import com.awesomeapp.contactlogin.Worker100_8
import com.awesomeapp.contactlogin.Model100_10
import com.awesomeapp.contactlogin.Model100_11
import com.awesomeapp.contactlogin.Activity100_12
import com.awesomeapp.contactlogin.Model100_14
import com.awesomeapp.contactlogin.Activity100_15
import com.awesomeapp.contactlogin.Model100_17
import com.awesomeapp.contactlogin.Activity100_18
import com.awesomeapp.contactlogin.Model100_20
import com.awesomeapp.contactlogin.Activity100_21
import com.awesomeapp.contactlogin.Model100_23
import com.awesomeapp.contactlogin.Activity100_24
import com.awesomeapp.contactlogin.Model100_26
import com.awesomeapp.contactlogin.Activity100_27
import com.awesomeapp.contactlogin.Model100_29
import com.awesomeapp.contactlogin.Activity100_30
import com.awesomeapp.contactlogin.Model100_32
import com.awesomeapp.contactlogin.Activity100_33
import com.awesomeapp.contactlogin.Model100_35
import com.awesomeapp.contactlogin.Activity100_36

@Module
@InstallIn(SingletonComponent::class)
object Module_100 {
    @Provides
    @Singleton
    fun provideRepository100_5(): Repository100_5 {
        return Repository100_5()
    }

    @Provides
    @Singleton
    fun provideApi100_6(): Api100_6 {
        return Api100_6()
    }
}