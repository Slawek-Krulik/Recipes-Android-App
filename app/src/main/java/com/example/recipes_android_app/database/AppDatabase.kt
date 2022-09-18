package com.example.recipes_android_app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.recipes_android_app.feature.add.data.local.AddRecipeDao
import com.example.recipes_android_app.feature.add.data.local.model.NewRecipeCached
import com.example.recipes_android_app.feature.add.domain.NewRecipe
import com.example.recipes_android_app.feature.remote.data.local.RecipeDao
import com.example.recipes_android_app.feature.remote.data.local.model.RecipeCached

@Database(entities = [RecipeCached::class, NewRecipeCached::class], version = 3)
@TypeConverters(ListConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
    abstract fun addRecipeDao(): AddRecipeDao
}