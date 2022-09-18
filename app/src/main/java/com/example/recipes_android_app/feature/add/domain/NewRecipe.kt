package com.example.recipes_android_app.feature.add.domain

import com.example.recipes_android_app.feature.add.data.local.model.NewRecipeCached

data class NewRecipe(val title: String, val note: String) {
    fun toMyRecipe(): NewRecipeCached {
        return NewRecipeCached(title = title, note = note)
    }
}