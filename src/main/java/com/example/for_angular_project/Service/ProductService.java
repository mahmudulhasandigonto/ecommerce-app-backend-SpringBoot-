package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Product;

public interface ProductService {

   public void postProduct(Product product);

   public List<Product> getProduct();

   public Product getProductById(Integer id);

   public void updateProduct(Integer id, Product product);

   public void deleteProduct(Integer id);

   public Product getProductByBrandId(Integer id);

}
