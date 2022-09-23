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

import com.example.for_angular_project.Entity.Brand;
import com.example.for_angular_project.Service.BrandService;

@RestController
   @CrossOrigin(origins = "http://localhost:4200")

public class BrandController {
   @Autowired
   BrandService brandService;

   @GetMapping("/getBrand")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<Brand> getBrandList() {
      return brandService.getBrandList();
   }

   @PostMapping("/postBrand")
   @CrossOrigin(origins = "http://localhost:4200")
   public String saveBrand(@RequestBody Brand brand) {
      brandService.saveBrand(brand);
      return "Data Submited Successfully";
   }

   @GetMapping("/getBrandById/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public Brand getBrandById(@PathVariable Integer id) {
      return brandService.getBrandById(id);
   }

   @DeleteMapping("/deleteBrand/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String deleteBrandById(@PathVariable Integer id) {
      brandService.deleteBrandById(id);
      return "Data Deleted Successfully";
   }

   @PutMapping("/updateBrand/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateBrandById(@PathVariable Integer id, @RequestBody Brand brand) {
      brandService.updateBrandById(id, brand);
      return "Data Update Successfully";
   }

}
