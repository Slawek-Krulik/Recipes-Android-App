package com.example.recipes_android_app.core.di

import com.example.recipes_android_app.feature.add.di.addRecipeModule
import com.example.recipes_android_app.feature.remote.di.recipeModule
import org.koin.core.module.Module

val featuresModule: List<Module> = recipeModule
        .plus(addRecipeModule)
