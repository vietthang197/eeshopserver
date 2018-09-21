package com.levietthang.eeshopserver.repositories.repository;

import com.levietthang.eeshopserver.entities.User;
import com.levietthang.eeshopserver.repositories.custom.CustomUserDetailsRepository;
import com.levietthang.eeshopserver.repositories.custom.CustomUserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, CustomUserRepository {
}
