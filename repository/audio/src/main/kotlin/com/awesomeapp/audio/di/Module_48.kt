package com.awesomeapp.audio.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audio.Viewmodel48_1
import com.awesomeapp.audio.Activity48_2
import com.awesomeapp.audio.Activity48_3
import com.awesomeapp.audio.Fragment48_4
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.audio.Usecase48_7
import com.awesomeapp.audio.Model48_9
import com.awesomeapp.audio.Model48_10
import com.awesomeapp.audio.Activity48_11
import com.awesomeapp.audio.Model48_13
import com.awesomeapp.audio.Activity48_14
import com.awesomeapp.audio.Model48_16
import com.awesomeapp.audio.Activity48_17
import com.awesomeapp.audio.Model48_19
import com.awesomeapp.audio.Activity48_20
import com.awesomeapp.audio.Model48_22
import com.awesomeapp.audio.Activity48_23
import com.awesomeapp.audio.Model48_25
import com.awesomeapp.audio.Activity48_26
import com.awesomeapp.audio.Model48_28
import com.awesomeapp.audio.Activity48_29
import com.awesomeapp.audio.Model48_31
import com.awesomeapp.audio.Activity48_32
import com.awesomeapp.audio.Model48_34
import com.awesomeapp.audio.Activity48_35
import com.awesomeapp.audio.Model48_37
import com.awesomeapp.audio.Activity48_38

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(): Repository48_5 {
        return Repository48_5()
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}