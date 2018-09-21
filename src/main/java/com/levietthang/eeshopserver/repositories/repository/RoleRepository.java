package com.levietthang.eeshopserver.repositories.repository;

import com.levietthang.eeshopserver.entities.Role;
import com.levietthang.eeshopserver.repositories.custom.CustomRoleRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>, CustomRoleRepository {
}
