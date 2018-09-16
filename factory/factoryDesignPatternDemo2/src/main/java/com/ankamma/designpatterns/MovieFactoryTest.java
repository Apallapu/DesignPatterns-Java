package com.ankamma.designpatterns;

import java.util.List;

import com.ankamma.designpatterns.factory.MovieFactory;
import com.ankamma.designpatterns.model.MovieRequest;
import com.ankamma.designpatterns.movie.MovieInfo;

/**
 * Hello world!
 *
 */
public class MovieFactoryTest {
	public static void main(String[] args) {
		MovieFactory movieFactory = new MovieFactory();
		MovieInfo movieInfo = movieFactory.getMoviesByLanguage("Telugu");
		List<MovieRequest> movieRequest = movieInfo.getMoviesByLanguage("Telugu");

		movieRequest.stream().forEach(movie -> {
			System.out.println("movieRequest::: movieRequest Name::" + movie.getMovieName());
		});

		MovieInfo movieInfo2 = movieFactory.getMoviesByLanguage("English");
		List<MovieRequest> movieRequest2 = movieInfo2.getMoviesByLanguage("English");

		movieRequest2.stream().forEach(movie -> {
			System.out.println("movieRequest::: movieRequest Name::" + movie.getMovieName());
		});

	}
}
