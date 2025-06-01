package com.bookmyshow.bangalore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.bangalore.entity.Movies;
import com.bookmyshow.bangalore.model.MovieDto;
import com.bookmyshow.bangalore.repository.MovieRepository;

@Service
public class BookingService implements IBookingService {

	@Autowired
	MovieRepository movieRepository;
	
	/**
	 *This method is use to save the movie details in database 
	 *API is  exposed publically as of now
	 */
	@Override
	public String addMovie(MovieDto movieDto) {
		
		//movieDto.
		Movies moveEntity= new Movies();

		moveEntity.setTitle(movieDto.getTitle());
		moveEntity.setDescription(moveEntity.getDescription());
		moveEntity.setDurationMinutes(moveEntity.getDurationMinutes());
		moveEntity.setLanguage(movieDto.getLanguage());
		moveEntity.setReleaseDate(moveEntity.getReleaseDate());
		
		 
		movieRepository.save(moveEntity);
		
        return "Movie added successfully";
        
		    }

	/**
	 * This  function is used to fetch the movie by ID
	 */
	@Override
	public MovieDto getMovieById(Long id) {
		// TODO Auto-generated method stub
		Optional<Movies> movies=movieRepository.findById(id);
		Movies movie= movies.get();
		return mapObject(movie);
		
	}
	
	private MovieDto mapObject(Movies movie) {
		MovieDto moveDTO= new MovieDto();
		moveDTO.setTitle(movie.getTitle());
		moveDTO.setDescription(movie.getDescription());
		moveDTO.setDurationMinutes(movie.getDurationMinutes());
		moveDTO.setLanguage(movie.getLanguage());
		moveDTO.setReleaseDate(movie.getReleaseDate());
		return moveDTO;
	}

	@Override
	public List<MovieDto> getMovies() {
		// TODO Auto-generated method stub
		List<Movies> movies  =movieRepository.findAll();
		//List<MovieDto> movieDtos = new ArrayList<MovieDto>();
		List<MovieDto> movieDtos =movies.stream().map(m ->this.mapObject(m)).collect(Collectors.toList());
		return movieDtos;
	}
	
}
