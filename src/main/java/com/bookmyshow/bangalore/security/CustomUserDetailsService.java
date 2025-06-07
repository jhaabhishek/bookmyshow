package com.bookmyshow.bangalore.security;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService  implements UserDetailsService{
	
	// Ideally fetch from DB
    private final Map<String, String> users = Map.of("mithun", "user123"); // BCrypt password

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 if (!users.containsKey(username)) {
	            throw new UsernameNotFoundException("User not found");
	        }

	        return new User(username, "{noop}"+users.get(username), List.of(new SimpleGrantedAuthority("ROLE_USER")));
	}

}
