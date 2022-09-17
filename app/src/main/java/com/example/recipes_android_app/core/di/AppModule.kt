package com.example.recipes_android_app.core.di

import android.content.Context
import android.net.ConnectivityManager
import com.example.recipes_android_app.core.exception.ErrorMapper
import com.example.recipes_android_app.core.exception.ErrorMapperImpl
import com.example.recipes_android_app.core.exception.ErrorWrapper
import com.example.recipes_android_app.core.exception.ErrorWrapperImpl
import com.example.recipes_android_app.core.network.NetworkStateAvailableImpl
import com.example.recipes_android_app.core.network.NetworkStateProvider
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {

    factory<NetworkStateProvider> { NetworkStateAvailableImpl(get()) }

    factory<ErrorWrapper> { ErrorWrapperImpl() }

    factory<ErrorMapper> { ErrorMapperImpl(androidContext()) }

    factory { androidContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager }
}