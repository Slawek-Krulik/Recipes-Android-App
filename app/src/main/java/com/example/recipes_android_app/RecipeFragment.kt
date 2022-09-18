package com.example.recipes_android_app

import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes_android_app.core.base.BaseFragment
import com.example.recipes_android_app.feature.presentation.RecipeAdapter
import com.example.recipes_android_app.feature.presentation.RecipeViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecipeFragment : BaseFragment<RecipeViewModel>(R.layout.fragment_recipe) {

    companion object {
        private const val TAG = "RecipeFragment"
    }

    override val viewModel: RecipeViewModel by viewModel()
    private var recyclerView: RecyclerView? = null
    private val gridLayoutManager: GridLayoutManager by inject()
    private lateinit var recipeAdapter: RecipeAdapter

    override fun initViews() {
        super.initViews()

        recyclerView = view?.findViewById(R.id.recipe_fragment_recycler)
        recipeAdapter = RecipeAdapter()
        recyclerView?.apply {
            adapter = recipeAdapter
            layoutManager = gridLayoutManager
        }

    }

    override fun initObservers() {
        super.initObservers()
        viewModel.recipes.observe(this) {
            Log.d(TAG, "initObservers: $it")
            recipeAdapter.submitList(it)

        }
    }
}