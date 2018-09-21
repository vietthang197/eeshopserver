package com.levietthang.eeshopserver.services;

import com.levietthang.eeshopserver.entities.UserDetails;

import java.util.List;


public interface CustomUserDetailsService {
    List<UserDetails> findAll();
    boolean checkExistsEmail(String email);
}
