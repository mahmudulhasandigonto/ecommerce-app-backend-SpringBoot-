package com.example.for_angular_project.error;

public class CustomerRegistrationNotFoundException extends Exception {

   public CustomerRegistrationNotFoundException() {
   }

   public CustomerRegistrationNotFoundException(String arg0) {
      super(arg0);
   }

   public CustomerRegistrationNotFoundException(Throwable arg0) {
      super(arg0);
   }

   public CustomerRegistrationNotFoundException(String arg0, Throwable arg1) {
      super(arg0, arg1);
   }

   public CustomerRegistrationNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3);
   }

}
