package com.bookmyshow.bangalore.controller;



import org.springframework.web.bind.annotation.*;

import com.bookmyshow.bangalore.service.IBookingService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	// Example: Search movies
    @GetMapping("/movies")
    public String searchMovies(@RequestParam String title) {
        // Logic to search movies
        return "List of movies matching: " + title;
    }

    // Example: Book tickets
    @PostMapping("/bookings")
    public String bookTickets(@RequestBody IBookingService bookingRequest) {
        // Logic to book tickets
        return "Booking successful";
    }

    // Example: View customer bookings
    @GetMapping("/bookings")
    public String viewBookings(@RequestParam Long customerId) {
        // Logic to fetch bookings for customer
        return "List of bookings for customer: " + customerId;
    }
}
