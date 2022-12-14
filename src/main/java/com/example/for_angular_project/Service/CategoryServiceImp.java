package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Category;
import com.example.for_angular_project.Repository.CategoryRepository;
import com.example.for_angular_project.error.CategoryNotFoundException;

@Service
public class CategoryServiceImp implements CategoryService {
   @Autowired
   CategoryRepository categoryRepository;

   @Override
   public void deleteCategory(Integer id) {
      categoryRepository.deleteById(id);
   }

   @Override
   public Category getCategoryById(Integer id) throws CategoryNotFoundException {
      Optional<Category> category = categoryRepository.findById(id);

      if (!category.isPresent()) {
         throw new CategoryNotFoundException("Category not found");
      }

      return category.get();
   }

   @Override
   public List<Category> getCategoryList() {
      return categoryRepository.findAll();
   }

   @Override
   public void postCategory(Category category) {
      categoryRepository.save(category);

   }

   @Override
   public void updateCategory(Integer id, Category category) {
      Category categoryDemo = categoryRepository.findById(id).get();

      if (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())) {
         categoryDemo.setCategoryName(category.getCategoryName());
      }
      categoryRepository.save(categoryDemo);
   }

}
