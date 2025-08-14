package com.awesomeapp.forecast.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecast.Viewmodel40_1
import com.awesomeapp.forecast.Activity40_2
import com.awesomeapp.forecast.Activity40_3
import com.awesomeapp.forecast.Fragment40_4
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.forecast.Service40_7
import com.awesomeapp.forecast.Worker40_8
import com.awesomeapp.forecast.Model40_10
import com.awesomeapp.forecast.Model40_11
import com.awesomeapp.forecast.Activity40_12
import com.awesomeapp.forecast.Model40_14
import com.awesomeapp.forecast.Activity40_15
import com.awesomeapp.forecast.Model40_17
import com.awesomeapp.forecast.Activity40_18
import com.awesomeapp.forecast.Model40_20
import com.awesomeapp.forecast.Activity40_21
import com.awesomeapp.forecast.Model40_23
import com.awesomeapp.forecast.Activity40_24
import com.awesomeapp.forecast.Model40_26
import com.awesomeapp.forecast.Activity40_27

@Module
@InstallIn(SingletonComponent::class)
object Module_40 {
    @Provides
    @Singleton
    fun provideRepository40_5(
        api0: Api24_6 = Api24_6()
    ): Repository40_5 {
        return Repository40_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi40_6(): Api40_6 {
        return Api40_6()
    }
}