package com.ankamma.designpatterns.factory;

import com.ankamma.designpatterns.product.EnglishMovie;
import com.ankamma.designpatterns.product.HindiMovie;
import com.ankamma.designpatterns.product.TeluguMovie;
import com.ankamma.designpatterns.product.MovieInfo;

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
