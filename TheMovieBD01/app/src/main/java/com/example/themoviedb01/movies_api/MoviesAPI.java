package com.example.themoviedb01.movies_api;

import com.example.themoviedb01.json_mapper.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesAPI {
    //Routers
    @GET("movie/popular?api_key=3e05df20467dcc95d150c574db75e0fe")
    Call<MovieResponse> getPopularMovies();


}
