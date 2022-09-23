package com.example.for_angular_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.for_angular_project.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
