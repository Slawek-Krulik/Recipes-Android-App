package com.example.recipes_android_app.core.base

sealed class UiState {
    object Idle : UiState()
    object Pending : UiState()
}