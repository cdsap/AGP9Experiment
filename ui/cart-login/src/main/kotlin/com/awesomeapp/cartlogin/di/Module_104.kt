package com.awesomeapp.cartlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Viewmodel104_1
import com.awesomeapp.cartlogin.Activity104_2
import com.awesomeapp.cartlogin.Activity104_3
import com.awesomeapp.cartlogin.Fragment104_4
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.cartlogin.Model104_8
import com.awesomeapp.cartlogin.Model104_9
import com.awesomeapp.cartlogin.Activity104_10
import com.awesomeapp.cartlogin.Model104_12
import com.awesomeapp.cartlogin.Activity104_13
import com.awesomeapp.cartlogin.Model104_15
import com.awesomeapp.cartlogin.Activity104_16
import com.awesomeapp.cartlogin.Model104_18
import com.awesomeapp.cartlogin.Activity104_19

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api84_6 = Api84_6()
    ): Repository104_5 {
        return Repository104_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}