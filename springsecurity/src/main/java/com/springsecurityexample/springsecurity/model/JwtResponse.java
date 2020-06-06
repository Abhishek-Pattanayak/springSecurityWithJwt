package com.springsecurityexample.springsecurity.model;

import java.io.Serializable;

public class JwtResponse implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private String jwttoken;

	public JwtResponse(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}
	
	public JwtResponse() {
		
	}

	public String getJwttoken() {
		return jwttoken;
	}
	

}
