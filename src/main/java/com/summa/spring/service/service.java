package com.summa.spring.service;

import com.summa.spring.entity.entity;
import com.summa.spring.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Autowired
    private repository userRepository;

    // Register a new user
    public entity register(entity user) {
        return userRepository.save(user);
    }

    public entity findByEmail(String email) {
        return userRepository.findByEmail(email); // Ensure this method exists and is implemented in the repository
    }


    public boolean authenticate(String email, String password) {
        entity user = findByEmail(email);
        return user != null && user.getPassword().equals(password); // Check if the user exists and password matches
    }

}
