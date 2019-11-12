package com.yasserelgammal.moviesrecycleviewmvvm_databinding.data.repositories

import com.yasserelgammal.moviesrecycleviewmvvm_databinding.data.network.MoviesApi

class MoviesRepository(
    private val api: MoviesApi
) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getMovies() }

}