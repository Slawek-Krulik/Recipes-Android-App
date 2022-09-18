package com.example.recipes_android_app.feature.remote.presentation.model

import com.example.recipes_android_app.feature.remote.domain.model.Recipe

data class RecipeDisplayable(
    val name: String?,
    val thumbnail: String
) {
    constructor(recipe: Recipe) : this(
        name = recipe.name,
        thumbnail = recipe.thumbnail
    )
}