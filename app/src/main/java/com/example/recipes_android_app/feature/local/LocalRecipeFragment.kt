package com.example.recipes_android_app.feature.local

import com.example.recipes_android_app.R
import com.example.recipes_android_app.core.base.BaseFragment
import com.example.recipes_android_app.feature.remote.presentation.RecipeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LocalRecipeFragment: BaseFragment<RecipeViewModel>(R.layout.fragment_local_recipe) {
    override val viewModel: RecipeViewModel by viewModel()
}