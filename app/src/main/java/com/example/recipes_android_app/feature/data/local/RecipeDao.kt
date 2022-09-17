package com.example.recipes_android_app.feature.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.recipes_android_app.feature.data.local.model.RecipeCached

@Dao
interface RecipeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveEpisodes(vararg episode: RecipeCached)

    @Query("SELECT * FROM RecipeCached")
    fun getRecipes(): List<RecipeCached>
}