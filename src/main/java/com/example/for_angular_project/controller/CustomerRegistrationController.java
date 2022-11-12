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
import com.example.for_angular_project.error.CustomerRegistrationNotFoundException;

@RestController
@CrossOrigin(origins = "*")

public class CustomerRegistrationController {
   @Autowired
   CustomerRegistrationService customerRegistrationService;

   @PostMapping("/postCustomerRegistration")
   public String postCustomerRegistration(@RequestBody CustomerRegistration customerRegistration) {
      customerRegistrationService.postCustomerRegistration(customerRegistration);
      return "Data Submited Successfully";
   }

   @GetMapping("/getCustomerRegistration")
   public List<CustomerRegistration> getCustomerRegistration() {
      return customerRegistrationService.getCustomerRegistration();
   }

   @GetMapping("/getCustomerRegistrationById/{id}")
   public CustomerRegistration getCustomerRegistrationById(@PathVariable Integer id)
         throws CustomerRegistrationNotFoundException {
      return customerRegistrationService.getCustomerRegistration(id);
   }

   @PutMapping("/updateCustomerRegistration/{id}")
   public String updateCustomerRegistration(@PathVariable Integer id,
         @RequestBody() CustomerRegistration customerRegistration) {
      customerRegistrationService.updateCustomerRegistration(id, customerRegistration);
      return "Data Update Successfully";
   }

   @DeleteMapping("/deleteCustomerRegistration/{id}")
   public String deleteCustomerRegistration(@PathVariable Integer id) {
      customerRegistrationService.deleteCustomerRegistration(id);
      return "Data Delete Successfully";
   }

}
