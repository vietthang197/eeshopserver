package com.levietthang.eeshopserver.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.hateoas.core.Relation;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "user_details")
@Table(name = "user_details", indexes = {@Index(name = "EMP_ID_INDEX", columnList = "id")})
public class UserDetails implements Serializable {

    @Id
    @Column(name = "id")
    private int userId;

    @Column
    private String name;

    @Column
    private Date birthday;

    @Column
    private String phone;

    @Column
    private String address1;

    @Column
    private String address2;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "id")
    private User user;


    public UserDetails() {
    }

    public UserDetails(int userId, String name, Date birthday, String phone, String countryId, String address1, String address2, String tinhId) {
        this.userId = userId;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
