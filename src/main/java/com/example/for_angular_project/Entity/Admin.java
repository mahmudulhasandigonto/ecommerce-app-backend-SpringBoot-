package com.example.for_angular_project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Admin
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer adminId;
   private String adminName;
   private String adminUser;
   private String adminEmail;
   private String adminPassword;
   private Integer adminLevel;

}