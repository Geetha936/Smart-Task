package com.Smart.demo.controllers;

import com.Smart.demo.Entity.User;
import com.Smart.demo.Repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    private final UserRepository userRepository;
    public  UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @PostMapping
    public  void createUser(@RequestBody User user){
        userRepository.save(user);
    }
}
