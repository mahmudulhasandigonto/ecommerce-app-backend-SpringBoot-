package com.example.for_angular_project.error;

public class ProductNotFoundException extends Exception {

   public ProductNotFoundException() {
   }

   public ProductNotFoundException(String arg0) {
      super(arg0);
   }

   public ProductNotFoundException(Throwable arg0) {
      super(arg0);
   }

   public ProductNotFoundException(String arg0, Throwable arg1) {
      super(arg0, arg1);
   }

   public ProductNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3);
   }

}
