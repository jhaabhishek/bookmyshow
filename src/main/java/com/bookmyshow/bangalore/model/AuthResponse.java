package com.bookmyshow.bangalore.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
	public AuthResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	private String jwt;

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
}
