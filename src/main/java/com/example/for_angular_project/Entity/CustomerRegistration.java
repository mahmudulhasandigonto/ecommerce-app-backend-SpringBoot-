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
public class CustomerRegistration {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer customerId;
   private String customerName;
   private String customerAddress;
   private String customerCity;
   private String customerCountry;
   private String customerZipCode;
   private String customerPhone;
   private String customerEmail;
   private String customerPassword;
}
