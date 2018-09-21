package com.levietthang.eeshopserver.services;

import  com.levietthang.eeshopserver.dto.UserRegisterDTO;
import  com.levietthang.eeshopserver.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomUserService {
    List<User> findAllUser();
    void createUser(User user);
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    String createUserAccount(UserRegisterDTO userRegisterDTO);
    boolean checkExistsUsername(String username);
}
