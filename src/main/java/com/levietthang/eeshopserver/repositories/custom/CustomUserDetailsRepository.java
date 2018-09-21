package com.levietthang.eeshopserver.repositories.custom;

public interface CustomUserDetailsRepository {
    boolean checkExistsEmail(String email);
}
