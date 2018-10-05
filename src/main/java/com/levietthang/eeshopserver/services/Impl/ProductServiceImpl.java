package com.levietthang.eeshopserver.services.Impl;

import com.levietthang.eeshopserver.entities.Product;
import com.levietthang.eeshopserver.repositories.repository.ProductRepository;
import com.levietthang.eeshopserver.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getListAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
