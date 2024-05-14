package com.example.apiiii.service;


import com.example.apiiii.Entity.Ground;
import com.example.apiiii.Entity.User;
import com.example.apiiii.pojo.UserPojo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository
public interface UserService {
    User saveUser(UserPojo userPojo) ;
    List<User> getAll() ;

    void deleteById(int id);
    Optional<Ground> findById(int id);
}