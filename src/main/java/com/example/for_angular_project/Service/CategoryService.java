package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Category;
import com.example.for_angular_project.error.CategoryNotFoundException;

public interface CategoryService {

   public void postCategory(Category category);

   public List<Category> getCategoryList();

   public Category getCategoryById(Integer id) throws CategoryNotFoundException;

   public void updateCategory(Integer id, Category category);

   public void deleteCategory(Integer id);

}
