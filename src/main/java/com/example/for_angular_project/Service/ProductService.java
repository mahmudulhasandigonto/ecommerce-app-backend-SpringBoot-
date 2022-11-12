package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Product;
import com.example.for_angular_project.error.ProductNotFoundException;

public interface ProductService {

   public void postProduct(Product product);

   public List<Product> getProduct();

   public Product getProductById(Integer id) throws ProductNotFoundException;

   public void updateProduct(Integer id, Product product);

   public void deleteProduct(Integer id);

   public Product getProductByBrandId(Integer id);

   public List<Product> getProductByNameStartWith(String name);

}
