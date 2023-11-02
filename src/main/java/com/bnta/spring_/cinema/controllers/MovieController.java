package com.bnta.spring_.cinema.controllers;

import com.bnta.spring_.cinema.models.Movie;
import com.bnta.spring_.cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies") // localhost:8080/movies
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        movieService.saveMovie(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovie(){
        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable long id){
        return new ResponseEntity<>(movieService.getMovieById(id), HttpStatus.OK);
    }










}
