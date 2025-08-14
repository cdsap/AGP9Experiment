package com.awesomeapp.identity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identity.Viewmodel4_1
import com.awesomeapp.identity.Activity4_2
import com.awesomeapp.identity.Activity4_3
import com.awesomeapp.identity.Fragment4_4
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.identity.Model4_8
import com.awesomeapp.identity.Model4_9
import com.awesomeapp.identity.Activity4_10
import com.awesomeapp.identity.Model4_12
import com.awesomeapp.identity.Activity4_13
import com.awesomeapp.identity.Model4_15
import com.awesomeapp.identity.Activity4_16
import com.awesomeapp.identity.Model4_18
import com.awesomeapp.identity.Activity4_19
import com.awesomeapp.identity.Model4_21
import com.awesomeapp.identity.Activity4_22
import com.awesomeapp.identity.Model4_24
import com.awesomeapp.identity.Activity4_25
import com.awesomeapp.identity.Model4_27
import com.awesomeapp.identity.Activity4_28
import com.awesomeapp.identity.Model4_30
import com.awesomeapp.identity.Activity4_31
import com.awesomeapp.identity.Model4_33

@Module
@InstallIn(SingletonComponent::class)
object Module_4 {
    @Provides
    @Singleton
    fun provideRepository4_5(): Repository4_5 {
        return Repository4_5()
    }

    @Provides
    @Singleton
    fun provideApi4_6(): Api4_6 {
        return Api4_6()
    }
}