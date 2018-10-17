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

    public Category() {
    }

    public Category(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
