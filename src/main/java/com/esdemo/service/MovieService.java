package com.esdemo.service;

import java.util.List;

import com.esdemo.model.Movie;
import com.esdemo.repository.es.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> getAll() {
        return repository.findAll();
    }

    public List<Movie> getByTitle(String title) {
        return repository.findByTitle(title);
    }

    public void addMovie(Movie movie) {
        repository.save(movie);
    }
}
