package com.example.recipes_android_app.feature.remote.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipes_android_app.feature.remote.domain.model.Recipe

@Entity
class RecipeCached(
    @PrimaryKey
    val id: Int,
    val name: String?,
    val thumbnail: String = ""
) {


    constructor(recipe: Recipe) : this(
        id = recipe.id,
        name = recipe.name,
        thumbnail = recipe.thumbnail
    )


    fun toRecipe() = Recipe(
        id = id,
        name = name,
        thumbnail = thumbnail
    )

}
