package com.example.recipes_android_app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.recipes_android_app.feature.data.local.RecipeDao
import com.example.recipes_android_app.feature.data.local.model.RecipeCached

@Database(entities = [RecipeCached::class], version = 1)
@TypeConverters(ListConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}