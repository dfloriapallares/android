package com.example.themoviedb01.json_mapper;

import java.util.List;

public class MovieResponse {
    //URL: https://api.themoviedb.org/3/movie/popular?api_key=3e05df20467dcc95d150c574db75e0fe
    private List<Movie> results;

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
