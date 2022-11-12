package com.example.for_angular_project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.for_angular_project.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

   List<Product> findByProductNameStartingWith(String name);

}
