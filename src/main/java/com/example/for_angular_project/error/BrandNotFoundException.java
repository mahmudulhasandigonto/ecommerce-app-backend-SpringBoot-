package com.example.for_angular_project.error;

public class BrandNotFoundException extends Exception {

   public BrandNotFoundException() {
   }

   public BrandNotFoundException(String arg0) {
      super(arg0);
   }

   public BrandNotFoundException(Throwable arg0) {
      super(arg0);
   }

   public BrandNotFoundException(String arg0, Throwable arg1) {
      super(arg0, arg1);
   }

   public BrandNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3);
   }

}
