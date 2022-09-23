package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Category;

public interface CategoryService {

   public void postCategory(Category category);

   public List<Category> getCategoryList();

   public Category getCategoryById(Integer id);

   public void updateCategory(Integer id, Category category);

   public void deleteCategory(Integer id);

}
