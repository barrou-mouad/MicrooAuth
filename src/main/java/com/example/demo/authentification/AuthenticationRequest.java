package com.example.demo.authentification;


import org.springframework.context.annotation.ComponentScan;

import lombok.Data;
// Java beans pour envoyer la requete HTTP 
@Data
public class AuthenticationRequest {

	
	private String username;
	private String password;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}