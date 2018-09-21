package com.levietthang.eeshopserver.repositories.custom;

import com.levietthang.eeshopserver.entities.Role;

import java.util.Set;

public interface CustomRoleRepository {
    Set<Role> findRoleByName(String name);
}
