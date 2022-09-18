package com.example.recipes_android_app.feature.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recipes_android_app.R
import com.example.recipes_android_app.feature.presentation.model.RecipeDisplayable

class RecipeAdapter : ListAdapter<RecipeDisplayable, RecipeAdapter.RecipeViewHolder>(RecipeDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recipe_item, parent, false)

        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object RecipeDiffCallback : DiffUtil.ItemCallback<RecipeDisplayable>() {
        override fun areItemsTheSame(
            oldItem: RecipeDisplayable,
            newItem: RecipeDisplayable
        ): Boolean {
            return oldItem.name.equals(newItem.name)
        }

        override fun areContentsTheSame(
            oldItem: RecipeDisplayable,
            newItem: RecipeDisplayable
        ): Boolean {
            return oldItem == newItem
        }

    }

    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.recipe_title)
        private val image: ImageView = itemView.findViewById(R.id.recipe_image)
        fun bind(item: RecipeDisplayable?) {
            title.text = item?.name
            Glide.with(itemView.context).load(item?.thumbnail).into(image)
        }
    }
}