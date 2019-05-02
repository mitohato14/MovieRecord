package com.ict.mito.movierecord.ui.top.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.mito.movierecord.databinding.MovieCardBinding
import com.ict.mito.movierecord.domain.MovieItem

/**
 * Created by mitohato14 on 2019-04-24.
 */
class TopViewHolder(private val binding: MovieCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(movieItem: MovieItem) {
        binding.also {
            it.movieItem = movieItem
            it.notifyChange()
            it.executePendingBindings()
        }
    }

    fun unbind() {
        binding.unbind()
    }

    fun setOnClickListener(onClickListener: View.OnClickListener) {
        binding.root.setOnClickListener(onClickListener)
    }

    companion object {
        fun create(
            inflater: LayoutInflater,
            parent: ViewGroup,
            attachToRoot: Boolean
        ): TopViewHolder = TopViewHolder(
            MovieCardBinding.inflate(
                inflater,
                parent,
                attachToRoot
            )
        )
    }
}