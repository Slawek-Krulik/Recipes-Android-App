package com.example.recipes_android_app.core.api

import com.example.recipes_android_app.core.api.model.RecipeResponse
import retrofit2.http.GET
import retrofit2.http.Headers

interface RecipesApi {
    @Headers("X-RapidAPI-Key: 44add27e2fmshf9271e745065a9dp160386jsnfe8f99291abb")
    @GET("recipes/list")
    suspend fun getAll(): RecipeResponse
}