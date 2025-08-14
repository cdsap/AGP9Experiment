package com.awesomeapp.analyticscontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscontact.Viewmodel72_1
import com.awesomeapp.analyticscontact.Activity72_2
import com.awesomeapp.analyticscontact.Activity72_3
import com.awesomeapp.analyticscontact.Fragment72_4
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.analyticscontact.Usecase72_7
import com.awesomeapp.analyticscontact.Model72_9
import com.awesomeapp.analyticscontact.Model72_10
import com.awesomeapp.analyticscontact.Activity72_11
import com.awesomeapp.analyticscontact.Model72_13
import com.awesomeapp.analyticscontact.Activity72_14
import com.awesomeapp.analyticscontact.Model72_16
import com.awesomeapp.analyticscontact.Activity72_17
import com.awesomeapp.analyticscontact.Model72_19
import com.awesomeapp.analyticscontact.Activity72_20
import com.awesomeapp.analyticscontact.Model72_22
import com.awesomeapp.analyticscontact.Activity72_23
import com.awesomeapp.analyticscontact.Model72_25
import com.awesomeapp.analyticscontact.Activity72_26
import com.awesomeapp.analyticscontact.Model72_28
import com.awesomeapp.analyticscontact.Activity72_29
import com.awesomeapp.analyticscontact.Model72_31
import com.awesomeapp.analyticscontact.Activity72_32
import com.awesomeapp.analyticscontact.Model72_34
import com.awesomeapp.analyticscontact.Activity72_35
import com.awesomeapp.analyticscontact.Model72_37
import com.awesomeapp.analyticscontact.Activity72_38
import com.awesomeapp.analyticscontact.Model72_40
import com.awesomeapp.analyticscontact.Activity72_41

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(
        api0: Api68_6 = Api68_6()
    ): Repository72_5 {
        return Repository72_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}