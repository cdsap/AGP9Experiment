package com.awesomeapp.timer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timer.Viewmodel32_1
import com.awesomeapp.timer.Activity32_2
import com.awesomeapp.timer.Activity32_3
import com.awesomeapp.timer.Fragment32_4
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.timer.Model32_8
import com.awesomeapp.timer.Model32_9
import com.awesomeapp.timer.Activity32_10
import com.awesomeapp.timer.Model32_12
import com.awesomeapp.timer.Activity32_13
import com.awesomeapp.timer.Model32_15
import com.awesomeapp.timer.Activity32_16
import com.awesomeapp.timer.Model32_18
import com.awesomeapp.timer.Activity32_19
import com.awesomeapp.timer.Model32_21
import com.awesomeapp.timer.Activity32_22
import com.awesomeapp.timer.Model32_24
import com.awesomeapp.timer.Activity32_25
import com.awesomeapp.timer.Model32_27
import com.awesomeapp.timer.Activity32_28
import com.awesomeapp.timer.Model32_30
import com.awesomeapp.timer.Activity32_31
import com.awesomeapp.timer.Model32_33
import com.awesomeapp.timer.Activity32_34
import com.awesomeapp.timer.Model32_36
import com.awesomeapp.timer.Activity32_37

@Module
@InstallIn(SingletonComponent::class)
object Module_32 {
    @Provides
    @Singleton
    fun provideRepository32_5(): Repository32_5 {
        return Repository32_5()
    }

    @Provides
    @Singleton
    fun provideApi32_6(): Api32_6 {
        return Api32_6()
    }
}