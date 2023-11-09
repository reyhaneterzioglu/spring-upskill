package com.cydeo.repository;

import com.cydeo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

    @Query(value = "SELECT COUNT(*) FROM products", nativeQuery = true)
    int productCount();


}
