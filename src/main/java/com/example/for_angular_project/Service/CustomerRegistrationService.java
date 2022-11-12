package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.CustomerRegistration;
import com.example.for_angular_project.error.CustomerRegistrationNotFoundException;

public interface CustomerRegistrationService {

   void postCustomerRegistration(CustomerRegistration customerRegistration);

   List<CustomerRegistration> getCustomerRegistration();

   CustomerRegistration getCustomerRegistration(Integer id) throws CustomerRegistrationNotFoundException;

   void updateCustomerRegistration(Integer id, CustomerRegistration customerRegistration);

   void deleteCustomerRegistration(Integer id);

}
