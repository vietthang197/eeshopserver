package com.levietthang.eeshopserver.repositories.repository;

import com.levietthang.eeshopserver.entities.Role;
import com.levietthang.eeshopserver.entities.User;
import com.levietthang.eeshopserver.repositories.custom.CustomUserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, CustomUserRepository {
    User findUserByUsername(String username);
    User findUserByUsernameAndId(String username, int id);
    User findUserByEmail(String email);
}
