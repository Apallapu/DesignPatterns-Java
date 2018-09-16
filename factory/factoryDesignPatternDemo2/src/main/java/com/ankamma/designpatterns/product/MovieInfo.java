package com.ankamma.designpatterns.product;

import java.util.List;

import com.ankamma.designpatterns.model.MovieRequest;

public interface MovieInfo {
	
	public List<MovieRequest> getMoviesByLanguage(String language);

}
