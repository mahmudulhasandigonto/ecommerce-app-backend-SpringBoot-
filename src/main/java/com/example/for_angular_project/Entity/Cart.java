package com.example.for_angular_project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer cartId; //
   private Long productId; //
   private String productName;
   private Float productPrice;
   private Integer quantity; //
   private String imageUrl;

}
