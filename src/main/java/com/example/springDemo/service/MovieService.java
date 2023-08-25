package com.example.springDemo.service;

import com.example.springDemo.domain.Movie;
import com.example.springDemo.domain.MovieList;

public interface MovieService {

	MovieList find(String movieName, String directorName);
	
	Movie get(String movieId);
	
	void add(Movie movie);
	
	void set(Movie movie);
	
	void remove(String movieId);
	
}
