package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.TitleAndSlogan;
import com.example.for_angular_project.Repository.TitleAndSloganRepository;

@Service
public class TitleAndSloganServiceImp implements TitleAndSloganService {

   @Autowired
   TitleAndSloganRepository titleAndSloganRepository;

   @Override
   public void postCopyRight(TitleAndSlogan titleAndSlogan) {

      titleAndSloganRepository.save(titleAndSlogan);
   }

   @Override
   public TitleAndSlogan getTitleAndSlogan(Integer titleAndSloganId) {
      return titleAndSloganRepository.findById(titleAndSloganId).get();

   }

   @Override
   public List<TitleAndSlogan> getTitleAndSlogans() {
      return titleAndSloganRepository.findAll();
   }

   @Override
   public void updateCopyRight(Integer id, TitleAndSlogan titleAndSlogan) {
      TitleAndSlogan titleAndSloganDemo = titleAndSloganRepository.findById(id).get();
      if (Objects.nonNull(titleAndSlogan.getSlogan()) && !"".equalsIgnoreCase(titleAndSlogan.getSlogan())) {
         titleAndSloganDemo.setSlogan(titleAndSlogan.getSlogan());
      }
      if (Objects.nonNull(titleAndSlogan.getTitle()) && !"".equalsIgnoreCase(titleAndSlogan.getTitle())) {
         titleAndSloganDemo.setTitle(titleAndSlogan.getTitle());
      }
      titleAndSloganRepository.save(titleAndSloganDemo);
   }

}
