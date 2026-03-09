package com.example.courier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courier.model.User;
import com.example.courier.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

@Autowired
UserRepository repo;

@PostMapping("/register")
public String register(@RequestBody User user){

repo.save(user);

return "User Registered Successfully";
}

@PostMapping("/login")
public String login(@RequestBody User user){

User u=repo.findByUsernameAndPassword(
user.getUsername(),
user.getPassword());

if(u!=null){
return "success";
}

return "fail";
}

}