package com.ankamma.designpatterns.factory;

import com.ankamma.designpatterns.movie.EnglishMovie;
import com.ankamma.designpatterns.movie.HindiMovie;
import com.ankamma.designpatterns.movie.MovieInfo;
import com.ankamma.designpatterns.movie.TeluguMovie;

public class MovieFactory {

	public MovieInfo getMoviesByLanguage(String language) {

		if (language.equalsIgnoreCase("Telugu")) {

			return new TeluguMovie();
		} else if (language.equalsIgnoreCase("English")) {
			return new EnglishMovie();
		} else if (language.equalsIgnoreCase("Hindi")) {
			return new HindiMovie();
		}

		return null;

	}

}
