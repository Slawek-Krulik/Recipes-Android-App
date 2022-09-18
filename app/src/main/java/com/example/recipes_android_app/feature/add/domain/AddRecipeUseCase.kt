package com.example.recipes_android_app.feature.add.domain

import com.example.recipes_android_app.core.base.UseCase
import com.example.recipes_android_app.feature.remote.domain.RecipeRepository
import com.example.recipes_android_app.feature.remote.domain.model.Recipe

class AddRecipeUseCase(private val repository: AddRecipeRepository) : UseCase<Unit, NewRecipe>() {
    override suspend fun action(params: NewRecipe) {
        repository.add(params)
    }
}
