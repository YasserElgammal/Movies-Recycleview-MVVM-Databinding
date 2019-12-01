package com.yasserelgammal.moviesrecycleviewmvvm_databinding.ui.movies

import android.view.View
import com.yasserelgammal.moviesrecycleviewmvvm_databinding.data.models.Movie

interface RecycleViewClickListener {
    fun onRecyclerViewItemClick(view: View, movie: Movie){

    }
}