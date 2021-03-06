package com.levietthang.eeshopserver.repositories.repository;

import com.levietthang.eeshopserver.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
