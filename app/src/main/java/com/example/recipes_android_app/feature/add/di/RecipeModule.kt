package com.example.recipes_android_app.feature.add.di

import com.example.recipes_android_app.feature.add.data.AddRecipeRepositoryImpl
import com.example.recipes_android_app.feature.add.domain.AddRecipeRepository
import com.example.recipes_android_app.feature.add.domain.AddRecipeUseCase
import com.example.recipes_android_app.feature.add.presentation.AddRecipeViewModel
import com.example.recipes_android_app.feature.remote.data.repository.RecipeRepositoryImpl
import com.example.recipes_android_app.feature.remote.domain.GetRecipeUseCase
import com.example.recipes_android_app.feature.remote.domain.RecipeRepository
import com.example.recipes_android_app.feature.remote.presentation.RecipeViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val recipeModule = module {

    //data
    factory<AddRecipeRepository> { AddRecipeRepositoryImpl(get()) }

    //domain
    factory<AddRecipeUseCase>{ AddRecipeUseCase(get()) }

    //presentation
    viewModel{ AddRecipeViewModel(get()) }
}