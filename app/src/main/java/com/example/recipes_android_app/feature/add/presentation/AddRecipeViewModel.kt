package com.example.recipes_android_app.feature.add.presentation

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipes_android_app.core.base.BaseViewModel
import com.example.recipes_android_app.core.exception.ErrorMapper
import com.example.recipes_android_app.feature.add.domain.AddRecipeUseCase
import com.example.recipes_android_app.feature.add.domain.NewRecipe
import com.example.recipes_android_app.feature.remote.domain.model.Recipe

class AddRecipeViewModel(private val addRecipeUseCase: AddRecipeUseCase,
                         private val errorMapper: ErrorMapper
) : BaseViewModel(errorMapper),
    DefaultLifecycleObserver {

    fun add(title: String, note: String) {
        addRecipeUseCase(params = NewRecipe(title, note),viewModelScope){ result ->
            result.onSuccess {  } //
            result.onFailure {  }
        }
    }
}