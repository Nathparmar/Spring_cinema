package com.bnta.spring_.cinema.services;

import com.bnta.spring_.cinema.models.Movie;
import com.bnta.spring_.cinema.repositries.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }


//    public void getMovie(Movie movie) {
//        movieRepository.findAll();
//    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

//    public Optional<Movie> getMovieById(long id){
//        return  movieRepository.findById(id);
//    }

    public Optional<Movie> getMovieById(long id) {
        assert movieRepository != null;
        return movieRepository.findById(id);
    }

//    public Movie getMovieById(long id) {
//        Optional<Movie> movieOptional = movieRepository.findById(id);
//        return movieOptional.orElse(null);
//    }

}
