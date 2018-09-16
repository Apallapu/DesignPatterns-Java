package com.ankamma.designpatterns.movie;

import java.util.ArrayList;
import java.util.List;

import com.ankamma.designpatterns.model.MovieRequest;

public class EnglishMovie implements MovieInfo {

	public List<MovieRequest> getMoviesByLanguage(String language) {

		List<MovieRequest> movieRequests = new ArrayList<MovieRequest>();

		MovieRequest movieRequest = new MovieRequest();
		movieRequest.setLanguage(language);
		movieRequest.setMovieId(12l);
		movieRequest.setMovieName("Avatar");
		movieRequest.setMovieTicketPrize(150.00);

		MovieRequest movieRequest2 = new MovieRequest();
		movieRequest2.setLanguage(language);
		movieRequest2.setMovieId(13l);
		movieRequest2.setMovieName("Titanic,");
		movieRequest2.setMovieTicketPrize(150.00);
		movieRequests.add(movieRequest);
		movieRequests.add(movieRequest2);
		return movieRequests;
	}

}
