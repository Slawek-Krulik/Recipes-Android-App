package com.example.recipes_android_app.core.di

import com.example.recipes_android_app.feature.remote.di.recipeModule
import org.koin.core.module.Module

val featuresModule = listOf<Module>(
    recipeModule
)