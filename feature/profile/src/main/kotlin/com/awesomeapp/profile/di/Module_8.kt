package com.awesomeapp.profile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profile.Viewmodel8_1
import com.awesomeapp.profile.Activity8_2
import com.awesomeapp.profile.Activity8_3
import com.awesomeapp.profile.Fragment8_4
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.profile.Model8_8
import com.awesomeapp.profile.Model8_9
import com.awesomeapp.profile.Activity8_10
import com.awesomeapp.profile.Model8_12
import com.awesomeapp.profile.Activity8_13
import com.awesomeapp.profile.Model8_15
import com.awesomeapp.profile.Activity8_16

@Module
@InstallIn(SingletonComponent::class)
object Module_8 {
    @Provides
    @Singleton
    fun provideRepository8_5(
        api0: Api4_6 = Api4_6()
    ): Repository8_5 {
        return Repository8_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi8_6(): Api8_6 {
        return Api8_6()
    }
}