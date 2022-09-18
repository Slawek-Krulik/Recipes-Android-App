package com.example.recipes_android_app.feature.add.domain

interface AddRecipeRepository {

    suspend fun add(recipe: NewRecipe)
}