package com.levietthang.eeshopserver.repositories.Impl;

import com.levietthang.eeshopserver.entities.Role;
import com.levietthang.eeshopserver.repositories.custom.CustomRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoleRepositoryImpl implements CustomRoleRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Set<Role> findRoleByName(String name) {
        List<Role> roles = entityManager
                .createNativeQuery("SELECT r.* FROM public.role r WHERE r.name = ?1", Role.class)
                .getResultList();
        if(!roles.isEmpty()) {
            Set<Role> roleSet = new HashSet<Role>(roles);
            return roleSet;
        }
        return null;
    }
}
