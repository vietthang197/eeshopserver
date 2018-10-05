package com.levietthang.eeshopserver.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.hateoas.core.Relation;

import javax.persistence.*;
import javax.validation.Constraint;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "user_details")
@Table(name = "user_details", indexes = {@Index(name = "EMP_EMAIL_INDEX", columnList = "id,email")})
public class UserDetails implements Serializable {

    @Id
    @Column(name = "id")
    public int userId;

    @Column
    public String name;

    @Column(unique = true)
    public String email;

    @Column
    public Date birthday;

    @Column
    public String phone;

    @Column
    public String countryId;

    @Column
    public String address1;

    @Column
    public String address2;

    @Column
    public String tinhId;

    @Column String huyenId;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id")
    @MapsId
    private User user;


    public UserDetails() {
    }

    public UserDetails(int userId, String name, String email, Date birthday, String phone, String countryId, String address1, String address2, String tinhId, String huyenId) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
        this.countryId = countryId;
        this.address1 = address1;
        this.address2 = address2;
        this.tinhId = tinhId;
        this.huyenId = huyenId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
