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

import com.example.for_angular_project.Entity.Category;
import com.example.for_angular_project.Service.CategoryService;
import com.example.for_angular_project.error.CategoryNotFoundException;

@RestController
@CrossOrigin(origins = "*")
public class CategoryController {
   @Autowired
   CategoryService categoryService;

   @PostMapping("/postCategory")
   public String postCategory(@RequestBody Category category) {
      categoryService.postCategory(category);
      return "Data Submited Successfully";
   }

   @GetMapping("/getCategory")
   public List<Category> getCategoryList() {
      return categoryService.getCategoryList();
   }

   @GetMapping("/getCategoryById/{id}")
   public Category getCategoryById(@PathVariable Integer id) throws CategoryNotFoundException {
      return categoryService.getCategoryById(id);
   }

   @PutMapping("/updateCategory/{id}")
   public String updateCategory(@PathVariable Integer id, @RequestBody() Category category) {
      categoryService.updateCategory(id, category);
      return "Data Update Successfully";
   }

   @DeleteMapping("/deleteCategory/{id}")
   public String deleteCategory(@PathVariable Integer id) {
      categoryService.deleteCategory(id);
      return "Data Delete Successfully";
   }
}
