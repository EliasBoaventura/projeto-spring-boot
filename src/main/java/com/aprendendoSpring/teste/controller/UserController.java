package com.aprendendoSpring.teste.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendendoSpring.teste.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1l, "elias", "elias4144@hotmail.com", "9999999", "12345");

		return ResponseEntity.ok().body(u);
	}

}
