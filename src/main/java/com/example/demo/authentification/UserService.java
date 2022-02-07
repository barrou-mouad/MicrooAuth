package com.example.demo.authentification;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserModel;
import com.example.demo.repository.userRepository;

@Service
public class UserService implements UserDetailsService{

	
	@Autowired
	private userRepository UserRepository;
	// pour récupérer l'utilisateur par username
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel foundeduser = UserRepository.findByUsername(username);
		if(foundeduser==null) {
			return null;
		}
		 
		String username2 = foundeduser.getUsername();
		String password2 = foundeduser.getPassword();
		
		return new User(username2, password2, new ArrayList<>());
	}

}
