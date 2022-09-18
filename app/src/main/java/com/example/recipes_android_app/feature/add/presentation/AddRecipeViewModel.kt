package com.example.recipes_android_app.feature.add.presentation

import androidx.lifecycle.ViewModel
import com.example.recipes_android_app.feature.add.domain.AddRecipeUseCase
import com.example.recipes_android_app.feature.remote.domain.model.Recipe

class AddRecipeViewModel(private val addRecipeUseCase: AddRecipeUseCase) : ViewModel() {

    fun add(title: String, note: String) {

    }
}