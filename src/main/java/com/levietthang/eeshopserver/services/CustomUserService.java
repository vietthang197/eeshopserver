package com.levietthang.eeshopserver.services;

import  com.levietthang.eeshopserver.dto.UserRegisterDTO;
import  com.levietthang.eeshopserver.entities.User;
import com.levietthang.eeshopserver.model.RegisterStatus;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomUserService {
    List<User> findAllUser();
    void createUser(User user);
    RegisterStatus createUserAccount(UserRegisterDTO userRegisterDTO);
    User setAdminRole(User user);
}
