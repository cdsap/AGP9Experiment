package com.awesomeapp.todo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todo.Viewmodel36_1
import com.awesomeapp.todo.Activity36_2
import com.awesomeapp.todo.Activity36_3
import com.awesomeapp.todo.Fragment36_4
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.todo.Usecase36_7
import com.awesomeapp.todo.Model36_9
import com.awesomeapp.todo.Model36_10
import com.awesomeapp.todo.Activity36_11
import com.awesomeapp.todo.Model36_13
import com.awesomeapp.todo.Activity36_14
import com.awesomeapp.todo.Model36_16
import com.awesomeapp.todo.Activity36_17
import com.awesomeapp.todo.Model36_19
import com.awesomeapp.todo.Activity36_20
import com.awesomeapp.todo.Model36_22
import com.awesomeapp.todo.Activity36_23
import com.awesomeapp.todo.Model36_25
import com.awesomeapp.todo.Activity36_26
import com.awesomeapp.todo.Model36_28
import com.awesomeapp.todo.Activity36_29
import com.awesomeapp.todo.Model36_31
import com.awesomeapp.todo.Activity36_32
import com.awesomeapp.todo.Model36_34
import com.awesomeapp.todo.Activity36_35
import com.awesomeapp.todo.Model36_37
import com.awesomeapp.todo.Activity36_38
import com.awesomeapp.todo.Model36_40
import com.awesomeapp.todo.Activity36_41
import com.awesomeapp.todo.Model36_43
import com.awesomeapp.todo.Activity36_44
import com.awesomeapp.todo.Model36_46

@Module
@InstallIn(SingletonComponent::class)
object Module_36 {
    @Provides
    @Singleton
    fun provideRepository36_5(
        api0: Api20_6 = Api20_6()
    ): Repository36_5 {
        return Repository36_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi36_6(): Api36_6 {
        return Api36_6()
    }
}