package com.ankamma.designpatterns.product;

import java.util.ArrayList;
import java.util.List;

import com.ankamma.designpatterns.model.MovieRequest;

public class HindiMovie implements MovieInfo {

	public List<MovieRequest> getMoviesByLanguage(String language){

		List<MovieRequest> movieRequests = new ArrayList<MovieRequest>();

		MovieRequest movieRequest = new MovieRequest();
		movieRequest.setLanguage(language);
		movieRequest.setMovieId(15l);
		movieRequest.setMovieName("dangal");
		movieRequest.setMovieTicketPrize(150.00);

		MovieRequest movieRequest2 = new MovieRequest();
		movieRequest2.setLanguage(language);
		movieRequest2.setMovieId(19l);
		movieRequest2.setMovieName("PK,");
		movieRequest2.setMovieTicketPrize(150.00);
		movieRequests.add(movieRequest);
		movieRequests.add(movieRequest2);
		return movieRequests;
	}

}
