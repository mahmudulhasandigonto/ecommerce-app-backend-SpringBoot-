package com.example.for_angular_project.error;

public class CartNotFoundException extends Exception {

   public CartNotFoundException() {
   }

   public CartNotFoundException(String arg0) {
      super(arg0);
   }

   public CartNotFoundException(Throwable arg0) {
      super(arg0);
   }

   public CartNotFoundException(String arg0, Throwable arg1) {
      super(arg0, arg1);
   }

   public CartNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3);
   }

}
