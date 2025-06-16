package com.example.demo.controller;

import com.example.demo.common.ApiResponse;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ApiResponse<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();
        return ApiResponse.success(users);
    }

    @PostMapping
    public ApiResponse<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ApiResponse.success(savedUser);
    }
}

