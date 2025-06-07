package com.bookmyshow.bangalore.controller;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.bangalore.model.AuthRequest;
import com.bookmyshow.bangalore.model.AuthResponse;
import com.bookmyshow.bangalore.utils.JwtUtils;

@RestController
public class AuthController {
	    @Autowired
	    private AuthenticationManager authenticationManager;


	    @Autowired
	    private UserDetailsService userDetailsService;

	    @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody AuthRequest request) throws AuthenticationException {
	        authenticationManager.authenticate(
			    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
			);

	        final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
	        String jwt;
	        jwt = JwtUtils.generateToken(userDetails.getUsername());
	        return ResponseEntity.ok(new AuthResponse(jwt));
	    }
}
