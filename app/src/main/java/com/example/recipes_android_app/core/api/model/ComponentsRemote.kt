package com.example.recipes_android_app.core.api.model

import com.google.gson.annotations.SerializedName

data class ComponentsRemote(
    @SerializedName("raw_text") val ingredient: String
)
