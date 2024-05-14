
package com.example.apiiii.service.impl;

import com.example.apiiii.pojo.RolePojo;
import com.example.apiiii.Repository.roleRepository;
import com.example.apiiii.Entity.Role;
import com.example.apiiii.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Repository
@RequiredArgsConstructor

public class Roleserviceimpl implements RoleService {
    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    private  final roleRepository roleRespository ;



    public Role saveData(RolePojo rolePojo){
        Role role  = new Role() ;
        role.setRoleName(rolePojo.getRoleName()); ;
        role.setRoleType(rolePojo.getRoleType()); ;

        roleRespository.save(role) ;
        return role;
    }
}
