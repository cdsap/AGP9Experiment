package com.awesomeapp.commentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentlogin.Viewmodel108_1
import com.awesomeapp.commentlogin.Activity108_2
import com.awesomeapp.commentlogin.Activity108_3
import com.awesomeapp.commentlogin.Fragment108_4
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.commentlogin.Usecase108_7
import com.awesomeapp.commentlogin.Model108_9
import com.awesomeapp.commentlogin.Model108_10
import com.awesomeapp.commentlogin.Activity108_11
import com.awesomeapp.commentlogin.Model108_13
import com.awesomeapp.commentlogin.Activity108_14
import com.awesomeapp.commentlogin.Model108_16
import com.awesomeapp.commentlogin.Activity108_17
import com.awesomeapp.commentlogin.Model108_19
import com.awesomeapp.commentlogin.Activity108_20
import com.awesomeapp.commentlogin.Model108_22
import com.awesomeapp.commentlogin.Activity108_23
import com.awesomeapp.commentlogin.Model108_25
import com.awesomeapp.commentlogin.Activity108_26
import com.awesomeapp.commentlogin.Model108_28
import com.awesomeapp.commentlogin.Activity108_29

@Module
@InstallIn(SingletonComponent::class)
object Module_108 {
    @Provides
    @Singleton
    fun provideRepository108_5(
        api0: Api88_6 = Api88_6()
    ): Repository108_5 {
        return Repository108_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi108_6(): Api108_6 {
        return Api108_6()
    }
}