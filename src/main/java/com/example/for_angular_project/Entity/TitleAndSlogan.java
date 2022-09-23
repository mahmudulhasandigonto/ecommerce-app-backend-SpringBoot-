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
public class TitleAndSlogan {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer titleAndSloganId;
   private String title;
   private String slogan;

}
