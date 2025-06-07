package com.bookmyshow.bangalore.controller;
import java.util.logging.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.bangalore.entity.Movies;
import com.bookmyshow.bangalore.entity.Theater;
import com.bookmyshow.bangalore.model.MovieDto;
import com.bookmyshow.bangalore.service.BookingService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	  // Example: Add a new movie
	Logger logger = Logger.getLogger(AdminController.class.getName());
     @Autowired
	 private BookingService bookingService;
	 
     @PostMapping("/movie")
     public ResponseEntity<String> addMovie(@RequestBody MovieDto moviedto) {
         String result = bookingService.addMovie(moviedto);
        return ResponseEntity.ok(result);
    }
     
     @GetMapping("/movies/{id}")
    public ResponseEntity<MovieDto> getMovie(@PathVariable(name = "id") Long id) {
    	 MovieDto movieDto = bookingService.getMovieById(id);
        return new ResponseEntity<MovieDto>(movieDto, HttpStatus.OK);
    }
     
     @GetMapping("/movies")
    // @Cacheable(cacheNames = "retriveMovies", value = "retriveMovies")
     public ResponseEntity<List<MovieDto>> getAllMovies() {
    	 
    	 logger.info("loading from db movie tb");
    	 
    	 
         List<MovieDto> result = bookingService.getMovies();
        return new ResponseEntity<List<MovieDto>>(result, HttpStatus.OK);
    }


    // Example: Add a new theater
    @PostMapping("/theaters")
    public String addTheater(@RequestBody Theater theater) {
        // Logic to add theater
        return "Theater added successfully";
    }

    // Example: View all bookings
    @GetMapping("/bookings")
    public String viewAllBookings() {
        // Logic to fetch all bookings
        return "List of all bookings";
    }
}
