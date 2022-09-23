package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Customer;
import com.example.for_angular_project.Repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

   @Autowired
   CustomerRepository customerRepository;

   @Override
   public void deleteCustomerById(Integer id) {
      customerRepository.deleteById(id);
   }

   @Override
   public List<Customer> getCustomer() {
      return customerRepository.findAll();
   }

   @Override
   public Customer getCustomerById(Integer id) {
      return customerRepository.findById(id).get();
   }

   @Override
   public void postCustomer(Customer customer) {
      customerRepository.save(customer);
   }

   @Override
   public void updateCustomer(Integer id, Customer customer) {
      Customer customerDemo = customerRepository.findById(id).get();

      if (Objects.nonNull(customer.getCustomerName()) && !"".equalsIgnoreCase(customer.getCustomerName())) {
         customerDemo.setCustomerName(customer.getCustomerName());
      }

      if (Objects.nonNull(customer.getCustomerCity()) && !"".equalsIgnoreCase(customer.getCustomerCity())) {
         customerDemo.setCustomerCity(customer.getCustomerCity());
      }

      if (Objects.nonNull(customer.getCustomerZipCode()) && !"".equalsIgnoreCase(customer.getCustomerZipCode())) {
         customerDemo.setCustomerZipCode(customer.getCustomerZipCode());
      }

      if (Objects.nonNull(customer.getCustomerEmail()) && !"".equalsIgnoreCase(customer.getCustomerEmail())) {
         customerDemo.setCustomerEmail(customer.getCustomerEmail());
      }

      if (Objects.nonNull(customer.getCustomerAddress()) && !"".equalsIgnoreCase(customer.getCustomerAddress())) {
         customerDemo.setCustomerAddress(customer.getCustomerAddress());
      }

      if (Objects.nonNull(customer.getCustomerCountry()) && !"".equalsIgnoreCase(customer.getCustomerCountry())) {
         customerDemo.setCustomerCountry(customer.getCustomerCountry());
      }
      if (Objects.nonNull(customer.getCustomerPhone()) && !"".equalsIgnoreCase(customer.getCustomerPhone())) {
         customerDemo.setCustomerPhone(customer.getCustomerPhone());
      }
      if (Objects.nonNull(customer.getCustomerPassword()) && !"".equalsIgnoreCase(customer.getCustomerPassword())) {
         customerDemo.setCustomerPassword(customer.getCustomerPassword());
      }

      customerRepository.save(customerDemo);

   }

}
