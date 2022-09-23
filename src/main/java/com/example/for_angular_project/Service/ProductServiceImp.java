package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Product;
import com.example.for_angular_project.Repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

   @Autowired
   ProductRepository productRepository;

   @Override
   public void deleteProduct(Integer id) {
      productRepository.deleteById(id);
   }

   @Override
   public List<Product> getProduct() {
      return productRepository.findAll();
   }

   @Override
   public Product getProductById(Integer id) {
      return productRepository.findById(id).get();
   }

   @Override
   public Product getProductByBrandId(Integer id) {
      return productRepository.findById(id).get();
   }

   @Override
   public void postProduct(Product product) {
      productRepository.save(product);
   }

   @Override
   public void updateProduct(Integer id, Product product) {
      Product productDemo = productRepository.findById(id).get();

      if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
         productDemo.setProductName(product.getProductName());
      }

      productDemo.setProductPrice(product.getProductPrice());

      if (Objects.nonNull(product.getProductDescription()) && !"".equalsIgnoreCase(product.getProductDescription())) {
         productDemo.setProductDescription(product.getProductDescription());
      }

      if (Objects.nonNull(product.getProductImgPath()) && !"".equalsIgnoreCase(product.getProductImgPath())) {
         productDemo.setProductImgPath(product.getProductImgPath());
      }

      productDemo.setProductType(product.getProductType());
      productDemo.setBrandId(product.getBrandId());
      productDemo.setCategoryId(product.getCategoryId());
      productRepository.save(productDemo);

   }

}
