package com.example.apiiii.service;

import com.example.apiiii.Entity.Ground;

import com.example.apiiii.Entity.Book;
import com.example.apiiii.pojo.BookPojo;
import com.example.apiiii.pojo.GroundPojo;
import com.example.apiiii.projection.Bookprojection;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface GroundService {
    Ground saveData(GroundPojo groundPojo);

    List<Ground> getAll();
    void deleteById(int id);
    Optional<Ground> findById(int id);
}