package com.example.recipes_android_app.feature.remote.presentation

import androidx.lifecycle.*
import com.example.recipes_android_app.core.base.BaseViewModel
import com.example.recipes_android_app.core.exception.ErrorMapper
import com.example.recipes_android_app.feature.remote.domain.GetRecipeUseCase
import com.example.recipes_android_app.feature.remote.domain.model.Recipe
import com.example.recipes_android_app.feature.remote.presentation.model.RecipeDisplayable

class RecipeViewModel(
    private val recipeUseCase: GetRecipeUseCase,
    private val errorMapper: ErrorMapper
) : BaseViewModel(errorMapper) {

    private val _recipe by lazy {
        MutableLiveData<List<Recipe>>()
            .also { getRecipes(it) }
    }

    private fun getRecipes(recipeLiveData: MutableLiveData<List<Recipe>>) {
        setPendingState()
        recipeUseCase(
            params = Unit,
            scope = viewModelScope
        ){result ->
            setIdleState()
            result.onSuccess { recipeLiveData.value = it }
            result.onFailure { handleFailure(it) }
        }
    }

    val recipes: LiveData<List<RecipeDisplayable>> by lazy {
        _recipe.map { recipes ->
            recipes.map { RecipeDisplayable(it) }
        }
    }

}