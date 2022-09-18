package com.example.recipes_android_app.feature.add.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.recipes_android_app.feature.add.data.local.model.NewRecipeCached

@Dao
interface AddRecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(recipe: NewRecipeCached)
}