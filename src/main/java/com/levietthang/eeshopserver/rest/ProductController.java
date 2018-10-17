package com.levietthang.eeshopserver.rest;

import com.levietthang.eeshopserver.entities.Product;
import com.levietthang.eeshopserver.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.levietthang.eeshopserver", "com.levietthang.eeshopserver.rest"})
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list-all-products")
    public List<Product> getListAllProduct() {
        return productService.getListAllProduct();
    }

    @PostMapping("/create-product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/update-product")
    public Product updateProduct(@RequestBody Product product) { return productService.updateProduct(product); }
}
