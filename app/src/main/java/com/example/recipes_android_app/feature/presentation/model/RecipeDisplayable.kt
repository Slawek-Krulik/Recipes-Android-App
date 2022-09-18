package com.example.recipes_android_app.feature.presentation.model

import com.example.recipes_android_app.feature.domain.model.Recipe

data class RecipeDisplayable(
    val name: String?,
    val thumbnail: String
) {
    constructor(recipe: Recipe) : this(
        name = recipe.name,
        thumbnail = recipe.thumbnail
    )
}