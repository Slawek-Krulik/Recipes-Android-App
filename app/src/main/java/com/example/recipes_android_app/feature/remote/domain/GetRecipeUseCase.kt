package com.example.recipes_android_app.feature.remote.domain

import com.example.recipes_android_app.core.base.UseCase
import com.example.recipes_android_app.feature.remote.domain.model.Recipe

class GetRecipeUseCase(private val repository: RecipeRepository): UseCase<List<Recipe>, Unit>() {

    override suspend fun action(params: Unit): List<Recipe>{
        return repository.getAllRecipe();
    }

}
