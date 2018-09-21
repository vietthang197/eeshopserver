package com.levietthang.eeshopserver.repositories.custom;

import com.levietthang.eeshopserver.entities.User;


public interface CustomUserRepository {
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    boolean checkExistsUsername(String username);
}
