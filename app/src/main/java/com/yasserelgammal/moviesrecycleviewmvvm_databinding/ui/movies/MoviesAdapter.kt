package com.yasserelgammal.moviesrecycleviewmvvm_databinding.ui.movies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.yasserelgammal.moviesrecycleviewmvvm_databinding.R
import com.yasserelgammal.moviesrecycleviewmvvm_databinding.data.models.Movie
import com.yasserelgammal.moviesrecycleviewmvvm_databinding.databinding.RecyclerviewMovieBinding

class MoviesAdapter (
    private val movies: List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){

    override fun getItemCount() = movies.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MoviesViewHolder (
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.recyclerview_movie,
            parent,false
        )
    )

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.recyclerViewMoviesBinding.movie = movies[position]

    }
    inner class MoviesViewHolder(
    val recyclerViewMoviesBinding : RecyclerviewMovieBinding
    ) :RecyclerView.ViewHolder(recyclerViewMoviesBinding.root)


}