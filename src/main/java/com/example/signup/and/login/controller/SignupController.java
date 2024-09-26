package com.example.signup.and.login.controller;

import com.example.signup.and.login.entity.User;
import com.example.signup.and.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class SignupController {
    @Autowired
    private UserService userService;







    @PostMapping("/signup")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
       User user1=userService.registerUser(user.getUsername(), user.getPassword());
       return ResponseEntity.ok(user1);



    }





}
