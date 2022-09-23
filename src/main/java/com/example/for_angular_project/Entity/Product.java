package com.example.for_angular_project.Entity;

import javax.persistence.Column;
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
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer productId;
   private String productName;
   private Double productPrice;
   // @Column(name=”DESC”, nullable=false, length=512)
   @Column(length = 5000)
   private String productDescription;
   private String productImgPath;
   private Integer productType;
   private Integer brandId;
   private Integer categoryId;

}
