package com.bnta.spring_.cinema.repositries;

import com.bnta.spring_.cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {



}
