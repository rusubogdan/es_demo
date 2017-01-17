package com.esdemo.controller;

import java.util.Arrays;
import java.util.List;

import com.esdemo.model.Movie;
import com.esdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/add")
    @ResponseBody
    public Movie addMovie(@RequestBody Movie movie) {
        try {
            movieService.addMovie(movie);
            return movie;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/addit")
    @ResponseBody
    public Movie addMovie() {
        try {
//            movieService.addMovie(movie);
            return new Movie();
        } catch (Exception e) {
            return new Movie();
        }
    }

    @RequestMapping("/{term}")
    @ResponseBody
    public List<Movie> searchMovie(@PathVariable String term) {
        return movieService.getByTitle(term);
    }

    @RequestMapping("/")
    @ResponseBody
    public List<Movie> searchMovie() {
        List<Movie> movies = movieService.getAll();

        return movies;
    }
}
