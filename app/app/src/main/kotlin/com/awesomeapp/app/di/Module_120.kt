package com.awesomeapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.app.Viewmodel120_1
import com.awesomeapp.app.Activity120_2
import com.awesomeapp.app.Activity120_3
import com.awesomeapp.app.Fragment120_4
import com.awesomeapp.app.Repository120_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.app.Api120_6
import com.awesomeapp.app.Service120_7
import com.awesomeapp.app.Worker120_8
import com.awesomeapp.app.Usecase120_9
import com.awesomeapp.app.Model120_11
import com.awesomeapp.app.Model120_12
import com.awesomeapp.app.Activity120_13
import com.awesomeapp.app.Model120_15
import com.awesomeapp.app.Activity120_16
import com.awesomeapp.app.Model120_18
import com.awesomeapp.app.Activity120_19
import com.awesomeapp.app.Model120_21
import com.awesomeapp.app.Activity120_22

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api96_6 = Api96_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api104_6 = Api104_6(),
        api3: Api108_6 = Api108_6(),
        api4: Api112_6 = Api112_6(),
        api5: Api116_6 = Api116_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}