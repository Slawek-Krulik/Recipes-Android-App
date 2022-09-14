package com.example.recipes_android_app.core.api.model

import com.google.gson.annotations.SerializedName

data class RecipeRemote(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("sections") val sections: List<SectionsRemote>,
    @SerializedName("instructions") val instructions: List<RecipeInstructionRemote>
)
