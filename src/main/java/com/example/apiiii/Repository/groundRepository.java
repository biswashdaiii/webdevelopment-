package com.example.apiiii.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.apiiii.Entity.Ground;

import java.util.List;



public interface groundRepository extends JpaRepository<Ground,Integer>{
}