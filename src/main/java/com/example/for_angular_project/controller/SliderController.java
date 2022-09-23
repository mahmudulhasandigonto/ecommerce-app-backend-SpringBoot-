package com.example.for_angular_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.for_angular_project.Entity.Slider;
import com.example.for_angular_project.Service.SliderService;

/**
 * SliderController
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class SliderController {

   @Autowired
   SliderService sliderService;

   @PostMapping("/postSlider")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postSlider(@RequestBody Slider slider) {
      sliderService.postSlider(slider);
      return "Data Submited Successfully";
   }

   @GetMapping("/getSlider")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<Slider> getSliders() {
      return sliderService.getSlider();
   }

   @GetMapping("/getSlider/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public Slider getSlider(@PathVariable Integer id) {
      return sliderService.getSliderById(id);
   }

   @DeleteMapping("/deleteSlider/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String deleteSlider(@PathVariable("id") Integer id) {
      sliderService.deleteSlider(id);
      return "Data Deleted Successfully";
   }

   @PutMapping("/updateSlider/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateSlider(@PathVariable Integer id, @RequestBody Slider slider) {
      sliderService.updateSliderById(id, slider);
      return "Data Updated Successfully";
   }

}