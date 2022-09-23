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
public class SocialMedia {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer socialMediaId;
   private String facebookUrl;
   private String twitterUrl;
   private String linkedinUrl;
   private String googlePlusUrl;
}
