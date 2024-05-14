package com.example.apiiii.service.impl;

import com.example.apiiii.pojo.GroundPojo;
import com.example.apiiii.Repository.groundRepository;
import com.example.apiiii.Entity.Ground ;
import com.example.apiiii.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Service




public class Groundserviceimpl implements GroundService{
    private final groundRepository groundRespository;
    @Override
    public Ground saveData(GroundPojo groundPojo){
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());
        groundRespository.save(ground);
        return ground;
    }
    public List<Ground> getAll(){
        return groundRespository.findAll();
    }

    @Override
    public void deleteById(int id) {
        groundRespository.deleteById(id);


    }

    @Override
    public Optional<Ground> findById(int id) {
        return Optional.empty();
    }




}