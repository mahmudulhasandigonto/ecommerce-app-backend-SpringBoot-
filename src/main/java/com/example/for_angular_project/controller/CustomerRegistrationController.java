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

import com.example.for_angular_project.Entity.CustomerRegistration;
import com.example.for_angular_project.Service.CustomerRegistrationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CustomerRegistrationController {
   @Autowired
   CustomerRegistrationService customerRegistrationService;

   @PostMapping("/postCustomerRegistration")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postCustomerRegistration(@RequestBody CustomerRegistration customerRegistration) {
      customerRegistrationService.postCustomerRegistration(customerRegistration);
      return "Data Submited Successfully";
   }

   @GetMapping("/getCustomerRegistration")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<CustomerRegistration> getCustomerRegistration() {
      return customerRegistrationService.getCustomerRegistration();
   }

   @GetMapping("/getCustomerRegistrationById/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public CustomerRegistration getCustomerRegistrationById(@PathVariable Integer id) {
      return customerRegistrationService.getCustomerRegistration(id);
   }

   @PutMapping("/updateCustomerRegistration/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateCustomerRegistration(@PathVariable Integer id,
         @RequestBody() CustomerRegistration customerRegistration) {
      customerRegistrationService.updateCustomerRegistration(id, customerRegistration);
      return "Data Update Successfully";
   }

   @DeleteMapping("/deleteCustomerRegistration/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String deleteCustomerRegistration(@PathVariable Integer id) {
      customerRegistrationService.deleteCustomerRegistration(id);
      return "Data Delete Successfully";
   }

}
