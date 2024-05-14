package com.example.apiiii.service;



import com.example.apiiii.Entity.Role;
import com.example.apiiii.pojo.RolePojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {

    Role saveData(RolePojo rolePojo) ;
    List<Role> findAll();
    Role findById(Integer id);
    void deleteById(Integer id);


}