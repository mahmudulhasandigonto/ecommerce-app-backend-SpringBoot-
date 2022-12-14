package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Brand;
import com.example.for_angular_project.Repository.BrandRepository;
import com.example.for_angular_project.error.BrandNotFoundException;

@Service
public class BrandServiceImp implements BrandService {
   @Autowired
   BrandRepository brandRepository;

   @Override
   public void deleteBrandById(Integer id) {
      brandRepository.deleteById(id);
   }

   @Override
   public Brand getBrandById(Integer id) throws BrandNotFoundException {
      Optional<Brand> brand = brandRepository.findById(id);

      if (!brand.isPresent()) {
         throw new BrandNotFoundException("Brand not found");
      }

      return brand.get();

   }

   @Override
   public List<Brand> getBrandList() {
      return brandRepository.findAll();
   }

   @Override
   public void saveBrand(Brand brand) {
      brandRepository.save(brand);

   }

   @Override
   public void updateBrandById(Integer id, Brand brand) {
      Brand demoBrand = brandRepository.findById(id).get();

      if (Objects.nonNull(brand.getBrandName()) && !"".equalsIgnoreCase(brand.getBrandName())) {
         demoBrand.setBrandName(brand.getBrandName());
      }

      brandRepository.save(demoBrand);
   }

}
