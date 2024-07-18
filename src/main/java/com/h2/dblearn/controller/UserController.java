package com.h2.dblearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.dblearn.entity.UserEntity;
import com.h2.dblearn.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/create")
	public ResponseEntity<?> createUser(UserEntity userEntity) {
		UserEntity save = userRepository.save(userEntity);
		return new ResponseEntity<>(save, HttpStatus.OK);
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<?> getAllUsers(){
		List<UserEntity> list = userRepository.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
