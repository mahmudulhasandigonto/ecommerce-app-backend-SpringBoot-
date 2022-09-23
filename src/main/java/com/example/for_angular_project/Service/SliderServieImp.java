package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Slider;
import com.example.for_angular_project.Repository.SliderReposiory;

@Service
public class SliderServieImp implements SliderService {

   @Autowired
   SliderReposiory sliderRepository;

   @Override
   public List<Slider> getSlider() {
      return sliderRepository.findAll();
   }

   @Override
   public Slider getSliderById(Integer id) {
      return sliderRepository.findById(id).get();
   }

   @Override
   public void postSlider(Slider slider) {
      sliderRepository.save(slider);

   }

   @Override
   public void updateSliderById(Integer id, Slider slider) {
      Slider sliderDemo = sliderRepository.findById(id).get();

      if (Objects.nonNull(slider.getSliderTitle()) && !"".equalsIgnoreCase(slider.getSliderTitle())) {
         sliderDemo.setSliderTitle(slider.getSliderTitle());
      }

      if (Objects.nonNull(slider.getSliderImgUrl()) && !"".equalsIgnoreCase(slider.getSliderImgUrl())) {
         sliderDemo.setSliderImgUrl(slider.getSliderImgUrl());
      }

      sliderRepository.save(slider);
   }

   @Override
   public void deleteSlider(Integer id) {
      sliderRepository.deleteById(id);

   }

}
