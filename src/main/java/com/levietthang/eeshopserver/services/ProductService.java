package com.levietthang.eeshopserver.services;

import com.levietthang.eeshopserver.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getListAllProduct();
    Product saveProduct(Product product);
}
