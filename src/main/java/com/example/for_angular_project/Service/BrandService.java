package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Brand;

public interface BrandService {

   public List<Brand> getBrandList();

   public void saveBrand(Brand brand);

   public Brand getBrandById(Integer id);

   public void deleteBrandById(Integer id);

   public void updateBrandById(Integer id, Brand brand);

}
