package com.example.springDemo.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.springDemo.domain.Movie;

public interface MovieMapper {
	
	List<Movie> find(@Param("movieName") String movieName, @Param("directorName") String directorName);
	
	Movie get(@Param("movieId") String movieId);
	
	Movie lock(@Param("movieId") String movieId);
	
	int add(Movie movie);
	
	int set(Movie movie);
	
	int remove(Movie movie);
}
