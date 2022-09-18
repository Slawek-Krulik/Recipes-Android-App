package com.example.recipes_android_app.feature.add.presentation

import androidx.fragment.app.Fragment
import com.example.recipes_android_app.R
import com.example.recipes_android_app.core.base.BaseFragment
import com.example.recipes_android_app.feature.remote.presentation.RecipeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddRecipeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddRecipeFragment : BaseFragment<RecipeViewModel>(R.layout.fragment_add_recipe) {
    override val viewModel: RecipeViewModel by viewModel()
}