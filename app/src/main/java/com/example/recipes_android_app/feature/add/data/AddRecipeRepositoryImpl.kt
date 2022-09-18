package com.example.recipes_android_app.feature.add.data

import com.example.recipes_android_app.feature.add.data.local.AddRecipeDao
import com.example.recipes_android_app.feature.add.domain.AddRecipeRepository
import com.example.recipes_android_app.feature.add.domain.NewRecipe

class AddRecipeRepositoryImpl(private val recipeDao: AddRecipeDao) : AddRecipeRepository {
    override suspend fun add(recipe: NewRecipe) {
        recipeDao.add(recipe.toMyRecipe())
    }

}