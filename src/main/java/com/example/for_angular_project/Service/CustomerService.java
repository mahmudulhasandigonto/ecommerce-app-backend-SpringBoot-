package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Customer;

public interface CustomerService {

   void postCustomer(Customer customer);

   List<Customer> getCustomer();

   Customer getCustomerById(Integer id);

   void deleteCustomerById(Integer id);

   void updateCustomer(Integer id, Customer customer);

}
