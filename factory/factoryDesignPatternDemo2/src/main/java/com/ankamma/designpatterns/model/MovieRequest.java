package com.ankamma.designpatterns.model;

public class MovieRequest {

	private Long movieId;

	private String movieName;

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private double movieTicketPrize;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getMovieTicketPrize() {
		return movieTicketPrize;
	}

	public void setMovieTicketPrize(double movieTicketPrize) {
		this.movieTicketPrize = movieTicketPrize;
	}

}
