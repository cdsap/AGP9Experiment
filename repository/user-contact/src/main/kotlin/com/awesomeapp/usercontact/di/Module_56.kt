package com.awesomeapp.usercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercontact.Viewmodel56_1
import com.awesomeapp.usercontact.Activity56_2
import com.awesomeapp.usercontact.Activity56_3
import com.awesomeapp.usercontact.Fragment56_4
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.usercontact.Model56_8
import com.awesomeapp.usercontact.Model56_9
import com.awesomeapp.usercontact.Activity56_10
import com.awesomeapp.usercontact.Model56_12
import com.awesomeapp.usercontact.Activity56_13
import com.awesomeapp.usercontact.Model56_15
import com.awesomeapp.usercontact.Activity56_16
import com.awesomeapp.usercontact.Model56_18
import com.awesomeapp.usercontact.Activity56_19
import com.awesomeapp.usercontact.Model56_21

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(): Repository56_5 {
        return Repository56_5()
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}