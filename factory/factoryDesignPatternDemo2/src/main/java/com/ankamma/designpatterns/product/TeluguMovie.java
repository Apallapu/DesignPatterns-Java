package com.ankamma.designpatterns.product;

import java.util.ArrayList;
import java.util.List;

import com.ankamma.designpatterns.model.MovieRequest;

public class TeluguMovie implements MovieInfo {

	public List<MovieRequest> getMoviesByLanguage(String language) {

		List<MovieRequest> movieRequests = new ArrayList<MovieRequest>();

		MovieRequest movieRequest = new MovieRequest();
		movieRequest.setLanguage(language);
		movieRequest.setMovieId(21l);
		movieRequest.setMovieName("Bahubali");
		movieRequest.setMovieTicketPrize(150.00);

		MovieRequest movieRequest2 = new MovieRequest();
		movieRequest2.setLanguage(language);
		movieRequest2.setMovieId(16l);
		movieRequest2.setMovieName("Bahubali-2");
		movieRequest2.setMovieTicketPrize(150.00);
		movieRequests.add(movieRequest);
		movieRequests.add(movieRequest2);
		return movieRequests;
	}

}
