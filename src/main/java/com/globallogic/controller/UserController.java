package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.entity.User;
import com.globallogic.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {

		return userRepository.save(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

}
