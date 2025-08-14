package com.awesomeapp.setting.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.setting.Viewmodel20_1
import com.awesomeapp.setting.Activity20_2
import com.awesomeapp.setting.Activity20_3
import com.awesomeapp.setting.Fragment20_4
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.setting.Service20_7
import com.awesomeapp.setting.Worker20_8
import com.awesomeapp.setting.Model20_10
import com.awesomeapp.setting.Model20_11
import com.awesomeapp.setting.Activity20_12
import com.awesomeapp.setting.Model20_14
import com.awesomeapp.setting.Activity20_15
import com.awesomeapp.setting.Model20_17
import com.awesomeapp.setting.Activity20_18
import com.awesomeapp.setting.Model20_20
import com.awesomeapp.setting.Activity20_21
import com.awesomeapp.setting.Model20_23
import com.awesomeapp.setting.Activity20_24

@Module
@InstallIn(SingletonComponent::class)
object Module_20 {
    @Provides
    @Singleton
    fun provideRepository20_5(): Repository20_5 {
        return Repository20_5()
    }

    @Provides
    @Singleton
    fun provideApi20_6(): Api20_6 {
        return Api20_6()
    }
}