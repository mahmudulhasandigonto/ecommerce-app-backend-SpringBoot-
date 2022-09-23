package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Slider;

public interface SliderService {

   public void postSlider(Slider slider);

   public List<Slider> getSlider();

   public Slider getSliderById(Integer id);

   public void updateSliderById(Integer id, Slider slider);

   public void deleteSlider(Integer id);

}
