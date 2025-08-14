package com.awesomeapp.share.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.share.Viewmodel16_1
import com.awesomeapp.share.Activity16_2
import com.awesomeapp.share.Activity16_3
import com.awesomeapp.share.Fragment16_4
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.share.Model16_8
import com.awesomeapp.share.Model16_9
import com.awesomeapp.share.Activity16_10
import com.awesomeapp.share.Model16_12
import com.awesomeapp.share.Activity16_13
import com.awesomeapp.share.Model16_15
import com.awesomeapp.share.Activity16_16
import com.awesomeapp.share.Model16_18
import com.awesomeapp.share.Activity16_19
import com.awesomeapp.share.Model16_21
import com.awesomeapp.share.Activity16_22
import com.awesomeapp.share.Model16_24
import com.awesomeapp.share.Activity16_25
import com.awesomeapp.share.Model16_27
import com.awesomeapp.share.Activity16_28

@Module
@InstallIn(SingletonComponent::class)
object Module_16 {
    @Provides
    @Singleton
    fun provideRepository16_5(
        api0: Api4_6 = Api4_6()
    ): Repository16_5 {
        return Repository16_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi16_6(): Api16_6 {
        return Api16_6()
    }
}