package com.levietthang.eeshopserver.model;

import com.levietthang.eeshopserver.dto.UserRegisterDTO;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.regex.Pattern;

public class Validator{

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,16}$";
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9_]{1,15}$";
    private static final String EMAIL_PATTERN = "^[\\w-]+@[\\w]+[.]+[\\w]{2,6}$";

    public static   boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

    public static   boolean validateUsername(String username) {
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        return pattern.matcher(username).matches();
    }
    public static   boolean validateEmail(String email) {
       // Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        boolean result = true;
        System.out.println("Email ->>>>>>"+email);
        try {
           if ( email != null || email.trim() != null) {
               InternetAddress emailAddr = new InternetAddress(email);
               emailAddr.validate();
           } else {
               return false;
           }
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static boolean validateMathPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public static boolean validateUserRegisterDTO(UserRegisterDTO userRegisterDTO) {
        return  validateUsername(userRegisterDTO.getUsername())
                && validatePassword(userRegisterDTO.getPassword())
                && validateEmail(userRegisterDTO.getEmail())
                && userRegisterDTO.getPassword().equals(userRegisterDTO.getConfirmPassword());
    }
}
