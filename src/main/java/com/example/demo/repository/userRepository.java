package com.example.demo.repository;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UserModel;

@Repository
public interface userRepository extends MongoRepository<UserModel,String>{
	
	UserModel findByUsername(String username);

}
