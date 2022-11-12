package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Admin;
import com.example.for_angular_project.Repository.AdminRepository;
import com.example.for_angular_project.error.AdminNotFoundException;

@Service
public class AdminServiceImp implements AdminSerive {
   @Autowired
   AdminRepository adminRepository;

   @Override
   public void deleteAdminById(Integer id) {
      adminRepository.deleteById(id);
   }

   @Override
   public List<Admin> getAdminList() {
      return adminRepository.findAll();
   }

   @Override
   public void updateAdminById(Integer id, Admin admin) {
      Admin adminDemo = adminRepository.findById(id).get();

      if (Objects.nonNull(adminDemo.getAdminName()) && !"".equalsIgnoreCase(adminDemo.getAdminName())) {
         adminDemo.setAdminName(admin.getAdminName());
      }

      if (Objects.nonNull(adminDemo.getAdminUser()) && !"".equalsIgnoreCase(adminDemo.getAdminUser())) {
         adminDemo.setAdminUser(admin.getAdminUser());
      }

      if (Objects.nonNull(adminDemo.getAdminEmail()) && !"".equalsIgnoreCase(adminDemo.getAdminEmail())) {
         adminDemo.setAdminEmail(admin.getAdminEmail());
      }
      if (Objects.nonNull(adminDemo.getAdminPassword()) && !"".equalsIgnoreCase(adminDemo.getAdminPassword())) {
         adminDemo.setAdminPassword(admin.getAdminPassword());
      }

      adminDemo.setAdminLevel(admin.getAdminLevel());

      adminRepository.save(adminDemo);
   }

   @Override
   public Admin getAdminById(Integer id) throws AdminNotFoundException {
      Optional<Admin> admin = adminRepository.findById(id);

      if (!admin.isPresent()) {
         throw new AdminNotFoundException("Admin not found");
      }

      return admin.get();
   }

   @Override
   public void postAdmin(Admin admin) {
      adminRepository.save(admin);
   }

}
