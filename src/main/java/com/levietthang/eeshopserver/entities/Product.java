package com.levietthang.eeshopserver.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Date;
import java.util.Currency;

@Entity(name = "product")
@Table(name = "product", indexes = {@Index(name = "EMP_product_INDEX", columnList = "id")})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    @SequenceGenerator(name="product_id_seq", sequenceName="product_id_seq", allocationSize=1)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Category category;

    @Column
    private String name;

    @Column(length = 2000)
    private String description;

    @Column
    private Date dateAdded;

    @Column
    private String image;

    @Column
    private Currency price;

    @Column
    private double sale;

    public Product() {
    }

    public Product(Category category, String name, String description, Date dateAdded, String image, Currency price, double sale) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.dateAdded = dateAdded;
        this.image = image;
        this.price = price;
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
