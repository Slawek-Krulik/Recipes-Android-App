package com.example.recipes_android_app.core.di

import androidx.room.Room
import com.example.recipes_android_app.database.AppDatabase
import com.example.recipes_android_app.feature.add.data.local.AddRecipeDao
import com.example.recipes_android_app.feature.remote.data.local.RecipeDao
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java,
            "app-database"
        ).build()
    }

    single<RecipeDao> {
        get<AppDatabase>().recipeDao()
    }

    single<AddRecipeDao> {
        get<AppDatabase>().addRecipeDao()
    }

}
