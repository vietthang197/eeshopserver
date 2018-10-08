package com.levietthang.eeshopserver.repositories.Impl;

import com.levietthang.eeshopserver.dto.UserRegisterDTO;
import com.levietthang.eeshopserver.entities.Role;
import com.levietthang.eeshopserver.entities.User;
import com.levietthang.eeshopserver.entities.UserDetails;
import com.levietthang.eeshopserver.repositories.custom.CustomUserDetailsRepository;
import com.levietthang.eeshopserver.repositories.custom.CustomUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class UserRepositoryImpl  implements CustomUserRepository {

    @Autowired
    private EntityManager entityManager;
    
}
