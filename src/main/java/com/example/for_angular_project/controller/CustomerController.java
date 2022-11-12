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

import com.example.for_angular_project.Entity.Customer;
import com.example.for_angular_project.Service.CustomerService;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

   @Autowired
   CustomerService customerService;

   @PostMapping("/postCustomer")
   public String postCustomer(@RequestBody Customer customer) {
      customerService.postCustomer(customer);
      return "Data submitted successfully";
   }

   @GetMapping("/getCustomer")
   public List<Customer> getCustomer() {

      return customerService.getCustomer();
   }

   @GetMapping("/getCustomer/{id}")
   public Customer getCustomer(@PathVariable("id") Integer id) {
      return customerService.getCustomerById(id);
   }

   @DeleteMapping("/deleteCustomer/{id}")
   public String deleteCustomer(@PathVariable("id") Integer id) {
      customerService.deleteCustomerById(id);
      return "Data deleted Successfully";
   }

   @PutMapping("updateCustomer/{id}")
   public String updateCustomer(@PathVariable("id") Integer id, @RequestBody Customer customer) {
      customerService.updateCustomer(id, customer);
      return "Data updated Successfully";
   }

}
