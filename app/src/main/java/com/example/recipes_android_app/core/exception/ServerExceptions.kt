package com.example.recipes_android_app.core.exception

sealed class ServerExceptions(message: String?) : Throwable(message) {
    class Internal(message: String?) : ServerExceptions(message)
    class BadRequest(message: String?) : ServerExceptions(message)
    class Unknown(message: String?) : ServerExceptions(message)
}