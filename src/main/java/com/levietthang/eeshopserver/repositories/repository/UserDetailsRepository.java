package com.levietthang.eeshopserver.repositories.repository;

import com.levietthang.eeshopserver.entities.UserDetails;
import com.levietthang.eeshopserver.repositories.custom.CustomUserDetailsRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>, CustomUserDetailsRepository {

}
