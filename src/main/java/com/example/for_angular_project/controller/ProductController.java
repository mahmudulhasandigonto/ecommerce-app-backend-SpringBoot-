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

import com.example.for_angular_project.Entity.Product;
import com.example.for_angular_project.Service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ProductController {

   @Autowired
   ProductService productService;

   @PostMapping("/postProduct")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postProduct(@RequestBody Product product) {
      productService.postProduct(product);
      return "Data Submited Successfully";
   }

   @GetMapping("/getProduct")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<Product> getProduct() {
      return productService.getProduct();
   }

   @GetMapping("/getProduct/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public Product getProductById(@PathVariable Integer id) {
      return productService.getProductById(id);
   }

   @GetMapping("/getProductByBrandId/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public Product getProductByBrandId(@PathVariable Integer id) {
      return productService.getProductByBrandId(id);
   }

   @PutMapping("/updateProduct/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateProduct(@PathVariable Integer id,
         @RequestBody() Product product) {
      productService.updateProduct(id, product);
      return "Data Update Successfully";
   }

   @DeleteMapping("/deleteProduct/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String deleteProduct(@PathVariable Integer id) {
      productService.deleteProduct(id);
      return "Data Delete Successfully";
   }

}
