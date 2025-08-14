package com.awesomeapp.mediacontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacontact.Viewmodel96_1
import com.awesomeapp.mediacontact.Activity96_2
import com.awesomeapp.mediacontact.Activity96_3
import com.awesomeapp.mediacontact.Fragment96_4
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.mediacontact.Usecase96_7
import com.awesomeapp.mediacontact.Model96_9
import com.awesomeapp.mediacontact.Model96_10
import com.awesomeapp.mediacontact.Activity96_11
import com.awesomeapp.mediacontact.Model96_13
import com.awesomeapp.mediacontact.Activity96_14
import com.awesomeapp.mediacontact.Model96_16
import com.awesomeapp.mediacontact.Activity96_17
import com.awesomeapp.mediacontact.Model96_19
import com.awesomeapp.mediacontact.Activity96_20
import com.awesomeapp.mediacontact.Model96_22
import com.awesomeapp.mediacontact.Activity96_23
import com.awesomeapp.mediacontact.Model96_25
import com.awesomeapp.mediacontact.Activity96_26
import com.awesomeapp.mediacontact.Model96_28
import com.awesomeapp.mediacontact.Activity96_29
import com.awesomeapp.mediacontact.Model96_31
import com.awesomeapp.mediacontact.Activity96_32
import com.awesomeapp.mediacontact.Model96_34
import com.awesomeapp.mediacontact.Activity96_35
import com.awesomeapp.mediacontact.Model96_37
import com.awesomeapp.mediacontact.Activity96_38

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api88_6 = Api88_6()
    ): Repository96_5 {
        return Repository96_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}