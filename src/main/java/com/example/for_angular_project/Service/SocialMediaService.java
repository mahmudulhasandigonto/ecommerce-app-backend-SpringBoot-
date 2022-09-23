package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.SocialMedia;

public interface SocialMediaService {

   void updateCopyRight(Integer id, SocialMedia socialMedia);

   void postCopyRight(SocialMedia socialMedia);

   List<SocialMedia> getSocialMedia();

   SocialMedia getSocialMedia(Integer socialMediaId);

}
