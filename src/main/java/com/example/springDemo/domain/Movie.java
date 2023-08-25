package com.example.springDemo.domain;

public class Movie {
	
	private String movieId;
	private String movieName;
	private Director director;
	
	public Movie(String movieId, String movieName) {
		this.movieId = movieId;
		this.movieName = movieName;
	}

	/**
	 * @return movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId セットする movieId
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName セットする movieName
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return director
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * @param director セットする director
	 */
	public void setDirector(Director director) {
		this.director = director;
	}
	
	

}
