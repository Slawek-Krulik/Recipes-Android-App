package com.example.recipes_android_app.feature.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipes_android_app.feature.domain.model.Recipe

@Entity
class RecipeCached(
    @PrimaryKey
    val id: Int,
    val name: String,
    val step: List<String>,
    val ingredient: List<String>
) {


    constructor(recipe: Recipe) : this(
        id = recipe.id,
        name = recipe.name,
        step = recipe.step,
        ingredient = recipe.ingredient
    )


    fun toRecipe() = Recipe(
        id = id,
        name = name,
        step = step,
        ingredient = ingredient
    )

}
