package com.summa.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.summa.spring.entity.entity;
import com.summa.spring.service.service;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class controller {

    @Autowired
    private service userService;

    // Register a new user
    @PostMapping("/register")
    public ResponseEntity<entity> register(@RequestBody entity user) {
        entity registeredUser = userService.register(user);
        return ResponseEntity.ok(registeredUser); // Return registered user details
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody entity loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        
        boolean isAuthenticated = userService.authenticate(email, password);
        
        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed!");
        }
    }

}
