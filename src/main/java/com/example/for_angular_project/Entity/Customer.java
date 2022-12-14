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
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer customerId;
   private String customerName;
   private String customerCity;
   private String customerZipCode;
   private String customerEmail;
   private String customerAddress;
   private String customerCountry;
   private String customerPhone;
   private String customerPassword;

}
