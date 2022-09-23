package com.example.for_angular_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.for_angular_project.Entity.TitleAndSlogan;
import com.example.for_angular_project.Service.TitleAndSloganService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TitleAndSloganController {

   @Autowired
   TitleAndSloganService titleAndSloganService;

   @PostMapping("/postTitleAndSlogan")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postCopyRight(@RequestBody TitleAndSlogan titleAndSlogan) {
      titleAndSloganService.postCopyRight(titleAndSlogan);
      return "Data submitted successfully";
   }

   @GetMapping("/getTitleAndSlogan/{id}")
   @CrossOrigin(origins = "http://localhost:4200")
   public TitleAndSlogan getTitleAndSlogan(@PathVariable("id") Integer titleAndSloganId) {
      return titleAndSloganService.getTitleAndSlogan(titleAndSloganId);
   }

   @GetMapping("/getTitleAndSlogan")
   @CrossOrigin(origins = "http://localhost:4200")
   public List<TitleAndSlogan> getTitleAndSlogans() {
      return titleAndSloganService.getTitleAndSlogans();
   }

   @PutMapping("/updateTitleAndSlogan/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateCopyRight(@PathVariable("id") Integer id, @RequestBody TitleAndSlogan titleAndSlogan) {
      titleAndSloganService.updateCopyRight(id, titleAndSlogan);
      return "Data Updated successfully";
   }

}
