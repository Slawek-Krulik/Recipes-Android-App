package com.example.recipes_android_app.core.exception

interface ErrorWrapper {
    fun wrap(throwable: Throwable): Throwable
}