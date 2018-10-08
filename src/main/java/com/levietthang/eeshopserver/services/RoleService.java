package com.levietthang.eeshopserver.services;

import com.levietthang.eeshopserver.entities.Role;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface RoleService {
    Set<Role> findRoleByName(String name);
    Role createRole(Role role);
    Set<Role> findAll();
}
