package com.bookmyshow.bangalore.service;

import java.util.List;

import com.bookmyshow.bangalore.model.MovieDto;

public interface IBookingService {
	  String addMovie(MovieDto moviedto);
	  MovieDto getMovieById(Long id);
	  List<MovieDto> getMovies();
}
