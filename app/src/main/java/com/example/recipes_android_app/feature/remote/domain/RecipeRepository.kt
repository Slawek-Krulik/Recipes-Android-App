package com.example.recipes_android_app.feature.remote.domain

import com.example.recipes_android_app.feature.remote.domain.model.Recipe

interface RecipeRepository {
    suspend fun getAllRecipe(): List<Recipe>
}