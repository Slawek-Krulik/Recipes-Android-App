package com.example.recipes_android_app.core.api.model

import com.example.recipes_android_app.feature.domain.model.Recipe
import com.google.gson.annotations.SerializedName

data class RecipeRemote(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("sections") val sections: List<SectionsRemote>?,
    @SerializedName("instructions") val instructions: List<RecipeInstructionRemote>
) {
    fun toRecipe(): Recipe {
       // val ingredients = sections?.flatMap{ it -> it.components.map { it.ingredient }}

        return Recipe(id,name)
    }
}
