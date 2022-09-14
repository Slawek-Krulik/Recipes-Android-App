package com.example.recipes_android_app.core.api.model

import com.google.gson.annotations.SerializedName

data class SectionsRemote(
    @SerializedName("components") val components: List<ComponentsRemote>
)
