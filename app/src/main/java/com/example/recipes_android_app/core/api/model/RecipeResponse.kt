package com.example.recipes_android_app.core.api.model

import com.google.gson.annotations.SerializedName

data class RecipeResponse(@SerializedName("results") val results: List<RecipeRemote>)
