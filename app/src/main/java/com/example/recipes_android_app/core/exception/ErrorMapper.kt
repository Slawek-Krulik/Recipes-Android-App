package com.example.recipes_android_app.core.exception

interface ErrorMapper {
    fun map(throwable: Throwable): String
}