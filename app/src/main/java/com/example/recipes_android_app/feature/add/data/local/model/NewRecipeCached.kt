package com.example.recipes_android_app.feature.add.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class NewRecipeCached(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String = "",
    val note: String = ""
)