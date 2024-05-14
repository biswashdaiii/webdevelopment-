package com.example.apiiii.service.impl;

import com.example.apiiii.pojo.UserPojo;
import com.example.apiiii.Repository.userRepository;
import com.example.apiiii.Entity.Ground;
import com.example.apiiii.Entity.User;
import com.example.apiiii.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Repository
@RequiredArgsConstructor


public class userserviceimpl implements UserService {

    private final userRepository userRespository;

    @Override
    public User saveUser(UserPojo userPojo) {
        User user = new User() ;
        user.setName(userPojo.getUsername());
        user.setId(user.getId());

        userRespository.save(user) ;
        return user;
    }

    @Override
    public List<User> getAll() {
        return userRespository.findAll();
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Optional<Ground> findById(int id) {
        return Optional.empty();
    }
}