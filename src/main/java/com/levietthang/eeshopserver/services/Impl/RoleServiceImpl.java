package com.levietthang.eeshopserver.services.Impl;

import com.levietthang.eeshopserver.entities.Role;
import com.levietthang.eeshopserver.repositories.repository.RoleRepository;
import com.levietthang.eeshopserver.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Set<Role> findRoleByName(String name) {
        return roleRepository.findRoleByName(name);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Set<Role> findAll() {
        return roleRepository.findAllRole();
    }
}
