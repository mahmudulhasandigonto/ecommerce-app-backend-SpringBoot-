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

import com.example.for_angular_project.Entity.SocialMedia;
import com.example.for_angular_project.Service.SocialMediaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SocialMediaController {
   @Autowired
   SocialMediaService socialMediaService;

   @PostMapping("/postSocialMedia")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postCopyRight(@RequestBody SocialMedia socialMedia) {
      socialMediaService.postCopyRight(socialMedia);
      return "Data submitted successfully";
   }

   @GetMapping("/getSocialMedia")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<SocialMedia> getSocialMedia() {
      return socialMediaService.getSocialMedia();

   }

   @GetMapping("/getSocialMedia/{socialMediaId}")
   @CrossOrigin(origins = "http://localhost:4200")

   public SocialMedia getSocialMedia(@PathVariable("socialMediaId") Integer socialMediaId) {
      return socialMediaService.getSocialMedia(socialMediaId);

   }

   @PutMapping("/updateSocialMedia/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateCopyRight(@PathVariable("id") Integer id, @RequestBody SocialMedia socialMedia) {
      socialMediaService.updateCopyRight(id, socialMedia);
      return "Data Updated successfully";
   }
}
