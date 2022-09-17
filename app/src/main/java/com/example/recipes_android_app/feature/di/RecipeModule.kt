package com.example.recipes_android_app.feature.di

import com.example.recipes_android_app.feature.data.repository.RecipeRepositoryImpl
import com.example.recipes_android_app.feature.domain.GetRecipeUseCase
import com.example.recipes_android_app.feature.domain.RecipeRepository
import com.example.recipes_android_app.feature.presentation.RecipeViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val recipeModule = module {

    //data
    factory<RecipeRepository> { RecipeRepositoryImpl(get(),get(), get(), get()) }

    //domain
    factory<GetRecipeUseCase>{ GetRecipeUseCase(get()) }

    //presentation
    viewModel{ RecipeViewModel(get(), get()) }
}