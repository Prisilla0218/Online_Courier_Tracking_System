package com.example.courier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courier.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

User findByUsernameAndPassword(String username,String password);

}