package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.CustomerRegistration;

public interface CustomerRegistrationService {

   void postCustomerRegistration(CustomerRegistration customerRegistration);

   List<CustomerRegistration> getCustomerRegistration();

   CustomerRegistration getCustomerRegistration(Integer id);

   void updateCustomerRegistration(Integer id, CustomerRegistration customerRegistration);

   void deleteCustomerRegistration(Integer id);

}
