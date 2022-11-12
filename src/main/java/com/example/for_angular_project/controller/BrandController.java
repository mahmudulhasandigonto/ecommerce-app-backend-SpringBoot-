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
import com.example.for_angular_project.error.BrandNotFoundException;

@RestController
@CrossOrigin(origins = "*")

public class BrandController {
   @Autowired
   BrandService brandService;

   @GetMapping("/getBrand")
   public List<Brand> getBrandList() {
      return brandService.getBrandList();
   }

   @PostMapping("/postBrand")
   public String saveBrand(@RequestBody Brand brand) {
      brandService.saveBrand(brand);
      return "Data Submited Successfully";
   }

   @GetMapping("/getBrandById/{id}")
   public Brand getBrandById(@PathVariable Integer id) throws BrandNotFoundException {
      return brandService.getBrandById(id);
   }

   @DeleteMapping("/deleteBrand/{id}")
   public String deleteBrandById(@PathVariable Integer id) {
      brandService.deleteBrandById(id);
      return "Data Deleted Successfully";
   }

   @PutMapping("/updateBrand/{id}")
   public String updateBrandById(@PathVariable Integer id, @RequestBody Brand brand) {
      brandService.updateBrandById(id, brand);
      return "Data Update Successfully";
   }

}
