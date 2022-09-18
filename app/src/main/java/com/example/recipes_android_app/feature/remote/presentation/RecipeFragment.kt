package com.example.recipes_android_app.feature.remote.presentation

import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes_android_app.R
import com.example.recipes_android_app.core.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecipeFragment : BaseFragment<RecipeViewModel>(R.layout.fragment_remote_recipe) {

    companion object {
        private const val TAG = "RecipeFragment"
    }

    override val viewModel: RecipeViewModel by viewModel()
    private var recyclerView: RecyclerView? = null
    private lateinit var recipeAdapter: RecipeAdapter

    override fun initViews() {
        super.initViews()

        initRecyclerView()

    }

    private fun initRecyclerView() {
        recyclerView = view?.findViewById(R.id.recipe_fragment_recycler)
        recipeAdapter = RecipeAdapter()
        recyclerView?.apply {
            adapter = recipeAdapter
            layoutManager = GridLayoutManager(requireContext(), 2)
        }
    }

    override fun initObservers() {
        super.initObservers()
        viewModel.recipes.observe(this) {
            Log.d(TAG, "initObservers: $it")
            recipeAdapter.submitList(it)

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}