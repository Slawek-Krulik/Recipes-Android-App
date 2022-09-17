package com.example.recipes_android_app.feature.data.repository

import com.example.recipes_android_app.core.api.RecipesApi
import com.example.recipes_android_app.core.exception.ErrorWrapper
import com.example.recipes_android_app.core.exception.callOrThrow
import com.example.recipes_android_app.core.network.NetworkStateProvider
import com.example.recipes_android_app.feature.data.local.RecipeDao
import com.example.recipes_android_app.feature.data.local.model.RecipeCached
import com.example.recipes_android_app.feature.domain.RecipeRepository
import com.example.recipes_android_app.feature.domain.model.Recipe

class RecipeRepositoryImpl(
    private val api: RecipesApi,
    private val recipeDao: RecipeDao,
    private val networkStateProvider: NetworkStateProvider,
    private val errorWrapper: ErrorWrapper
) : RecipeRepository {

    override suspend fun getAllRecipe(): List<Recipe> {
        return if (networkStateProvider.isNetworkAvailable()) {
            callOrThrow(errorWrapper) { getRecipeFromRemote() }
                .also { saveRecipeToLocal(it) }
        } else {
           getRecipeFromLocal()
        }
    }

    private suspend fun getRecipeFromLocal(): List<Recipe> {
        return recipeDao.getRecipes().map { it.toRecipe() }
    }

    private suspend fun getRecipeFromRemote(): List<Recipe> {
        return api.getAll()
            .results
            .map { it.toRecipe() }
    }

    private suspend fun saveRecipeToLocal(episodes: List<Recipe>) {
        episodes.map { RecipeCached(it) }
            .toTypedArray()
            .let { recipeDao.saveEpisodes(*it) }
    }
}