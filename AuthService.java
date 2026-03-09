package com.example.courier.service;

import org.springframework.stereotype.Service;
import com.example.courier.model.User;
import com.example.courier.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository repo;

    public AuthService(UserRepository repo){
        this.repo = repo;
    }

    public boolean login(String username,String password){

        User user = repo.findByUsernameAndPassword(username,password);

        return user != null;
    }
}