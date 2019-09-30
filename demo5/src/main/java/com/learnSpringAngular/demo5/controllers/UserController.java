package com.learnSpringAngular.demo5.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpringAngular.demo5.entities.User;
import com.learnSpringAngular.demo5.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
	}
	
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
