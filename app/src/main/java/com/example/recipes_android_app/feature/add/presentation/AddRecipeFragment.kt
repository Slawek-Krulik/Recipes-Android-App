package com.example.recipes_android_app.feature.add.presentation

import android.widget.Button
import android.widget.EditText
import com.example.recipes_android_app.R
import com.example.recipes_android_app.core.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class AddRecipeFragment : BaseFragment<AddRecipeViewModel>(R.layout.fragment_add_recipe) {
    override val viewModel: AddRecipeViewModel by viewModel()

    private var title: EditText? = null
    private var note: EditText? = null
    private var fabAddRecipe: Button? = null

    override fun initViews() {
        super.initViews()
        title = view?.findViewById(R.id.add_recipe_title)
        note = view?.findViewById(R.id.add_recipe_note)
        fabAddRecipe = view?.findViewById(R.id.add_recipe_button)
    }

    override fun initObservers() {
        super.initObservers()

        fabAddRecipe?.setOnClickListener {
            viewModel.add(title?.text.toString(), note?.text.toString())
        }
    }
}