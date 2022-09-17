package com.example.recipes_android_app.feature.domain

import com.example.recipes_android_app.feature.domain.model.Recipe

interface RecipeRepository {
    suspend fun getAllRecipe() : List<Recipe>
}