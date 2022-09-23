package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.SocialMedia;
import com.example.for_angular_project.Repository.SocialMediaRepository;

@Service
public class SocialMediaServiceImp implements SocialMediaService {

   @Autowired
   SocialMediaRepository socialMediaRepository;

   @Override
   public void postCopyRight(SocialMedia socialMedia) {
      socialMediaRepository.save(socialMedia);

   }

   @Override
   public List<SocialMedia> getSocialMedia() {
      return socialMediaRepository.findAll();
   }

   @Override
   public SocialMedia getSocialMedia(Integer socialMediaId) {
      return socialMediaRepository.findById(socialMediaId).get();
   }

   @Override
   public void updateCopyRight(Integer id, SocialMedia socialMedia) {
      SocialMedia socialMediaDemo = socialMediaRepository.findById(id).get();

      if (Objects.nonNull(socialMedia.getFacebookUrl()) && !"".equalsIgnoreCase(socialMedia.getFacebookUrl())) {
         socialMediaDemo.setFacebookUrl(socialMedia.getFacebookUrl());
      }

      if (Objects.nonNull(socialMedia.getGooglePlusUrl()) && !"".equalsIgnoreCase(socialMedia.getGooglePlusUrl())) {
         socialMediaDemo.setGooglePlusUrl(socialMedia.getGooglePlusUrl());
      }
      if (Objects.nonNull(socialMedia.getLinkedinUrl()) && !"".equalsIgnoreCase(socialMedia.getLinkedinUrl())) {
         socialMediaDemo.setLinkedinUrl(socialMedia.getLinkedinUrl());
      }
      if (Objects.nonNull(socialMedia.getTwitterUrl()) && !"".equalsIgnoreCase(socialMedia.getTwitterUrl())) {
         socialMediaDemo.setTwitterUrl(socialMedia.getTwitterUrl());
      }

      socialMediaRepository.save(socialMediaDemo);

   }

}
