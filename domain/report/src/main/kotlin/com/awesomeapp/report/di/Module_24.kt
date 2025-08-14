package com.awesomeapp.report.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.report.Viewmodel24_1
import com.awesomeapp.report.Activity24_2
import com.awesomeapp.report.Activity24_3
import com.awesomeapp.report.Fragment24_4
import com.awesomeapp.report.Repository24_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.report.Usecase24_7
import com.awesomeapp.report.Model24_9
import com.awesomeapp.report.Model24_10
import com.awesomeapp.report.Activity24_11
import com.awesomeapp.report.Model24_13
import com.awesomeapp.report.Activity24_14
import com.awesomeapp.report.Model24_16
import com.awesomeapp.report.Activity24_17
import com.awesomeapp.report.Model24_19
import com.awesomeapp.report.Activity24_20
import com.awesomeapp.report.Model24_22
import com.awesomeapp.report.Activity24_23
import com.awesomeapp.report.Model24_25
import com.awesomeapp.report.Activity24_26
import com.awesomeapp.report.Model24_28
import com.awesomeapp.report.Activity24_29
import com.awesomeapp.report.Model24_31
import com.awesomeapp.report.Activity24_32
import com.awesomeapp.report.Model24_34
import com.awesomeapp.report.Activity24_35
import com.awesomeapp.report.Model24_37
import com.awesomeapp.report.Activity24_38
import com.awesomeapp.report.Model24_40
import com.awesomeapp.report.Activity24_41

@Module
@InstallIn(SingletonComponent::class)
object Module_24 {
    @Provides
    @Singleton
    fun provideRepository24_5(): Repository24_5 {
        return Repository24_5()
    }

    @Provides
    @Singleton
    fun provideApi24_6(): Api24_6 {
        return Api24_6()
    }
}