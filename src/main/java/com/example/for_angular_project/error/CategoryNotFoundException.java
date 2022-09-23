package com.example.for_angular_project.error;

public class CategoryNotFoundException extends Exception {

   public CategoryNotFoundException() {
   }

   public CategoryNotFoundException(String arg0) {
      super(arg0);
   }

   public CategoryNotFoundException(Throwable arg0) {
      super(arg0);
   }

   public CategoryNotFoundException(String arg0, Throwable arg1) {
      super(arg0, arg1);
   }

   public CategoryNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3);
   }

}
