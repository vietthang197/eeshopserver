package com.levietthang.eeshopserver.dto;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Date;

public class UserRegisterDTO implements Serializable {

    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private String confirmEmail;
    private String name;
    private Date birthday;
    private String countryId;
    private String phone;
    private String address1;
    private String address2;
    private String tinhId;
    private String huyenId;

    public UserRegisterDTO() {
    }

    public UserRegisterDTO(String username, String password, String confirmPassword, String email, String confirmEmail, String name, Date birthday, String countryId, String phone, String address1, String address2, String tinhId, String huyenId) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.confirmEmail = confirmEmail;
        this.name = name;
        this.birthday = birthday;
        this.countryId = countryId;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.tinhId = tinhId;
        this.huyenId = huyenId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTinhId() {
        return tinhId;
    }

    public void setTinhId(String tinhId) {
        this.tinhId = tinhId;
    }

    public String getHuyenId() {
        return huyenId;
    }

    public void setHuyenId(String huyenId) {
        this.huyenId = huyenId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
