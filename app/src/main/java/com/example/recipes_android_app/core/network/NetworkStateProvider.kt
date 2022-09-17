package com.example.recipes_android_app.core.network

interface NetworkStateProvider {
    fun isNetworkAvailable(): Boolean
}