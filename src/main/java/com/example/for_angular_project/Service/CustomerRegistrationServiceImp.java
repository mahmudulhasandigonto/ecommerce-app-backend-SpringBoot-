package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.CustomerRegistration;
import com.example.for_angular_project.Repository.CustomerRegistrationRepository;
import com.example.for_angular_project.error.CustomerRegistrationNotFoundException;

@Service
public class CustomerRegistrationServiceImp implements CustomerRegistrationService {

   @Autowired
   CustomerRegistrationRepository customerRegistrationRepository;

   @Override
   public void deleteCustomerRegistration(Integer id) {
      customerRegistrationRepository.deleteById(id);
   }

   @Override
   public List<CustomerRegistration> getCustomerRegistration() {
      return customerRegistrationRepository.findAll();
   }

   @Override
   public CustomerRegistration getCustomerRegistration(Integer id) throws CustomerRegistrationNotFoundException {
      Optional<CustomerRegistration> customerRegistration = customerRegistrationRepository.findById(id);

      if (!customerRegistration.isPresent()) {
         throw new CustomerRegistrationNotFoundException("Customer not found");
      }

      return customerRegistration.get();
   }

   @Override
   public void postCustomerRegistration(CustomerRegistration customerRegistration) {
      customerRegistrationRepository.save(customerRegistration);
   }

   @Override
   public void updateCustomerRegistration(Integer id, CustomerRegistration customerRegistration) {
      CustomerRegistration customerRegistrationDemo = customerRegistrationRepository.findById(id).get();

      if (Objects.nonNull(customerRegistration.getCustomerName())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerName())) {
         customerRegistrationDemo.setCustomerName(customerRegistration.getCustomerName());

      }

      if (Objects.nonNull(customerRegistration.getCustomerAddress())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerAddress())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerAddress());

      }

      if (Objects.nonNull(customerRegistration.getCustomerCity())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerCity())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerCity());

      }

      if (Objects.nonNull(customerRegistration.getCustomerCountry())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerCountry())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerCountry());

      }

      if (Objects.nonNull(customerRegistration.getCustomerZipCode())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerZipCode())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerZipCode());

      }

      if (Objects.nonNull(customerRegistration.getCustomerPhone())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerPhone())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerPhone());

      }

      if (Objects.nonNull(customerRegistration.getCustomerEmail())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerEmail())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerEmail());

      }

      if (Objects.nonNull(customerRegistration.getCustomerPassword())
            && !"".equalsIgnoreCase(customerRegistration.getCustomerPassword())) {

         customerRegistrationDemo.setCustomerAddress(customerRegistration.getCustomerPassword());

      }

      customerRegistrationRepository.save(customerRegistrationDemo);

   }

}
