package com.example.recipes_android_app

import android.util.Log
import com.example.recipes_android_app.core.base.BaseFragment
import com.example.recipes_android_app.feature.presentation.RecipeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecipeFragment : BaseFragment<RecipeViewModel>(R.layout.fragment_recipe) {

    companion object{
        private const val TAG = "RecipeFragment"
    }
    override val viewModel: RecipeViewModel by viewModel()

    override fun initObservers() {
        super.initObservers()
        viewModel.recipes.observe(this){
            Log.d(TAG, "initObservers: $it")
        }
    }
}