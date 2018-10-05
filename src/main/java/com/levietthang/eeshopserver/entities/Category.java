package com.levietthang.eeshopserver.entities;

import javax.persistence.*;

@Entity(name = "category")
@Table(name = "category", indexes = {@Index(name = "EMP_category_INDEX", columnList = "id")})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_id_seq")
    @SequenceGenerator(name="category_id_seq", sequenceName="category_id_seq", allocationSize=1)
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String image;
}
