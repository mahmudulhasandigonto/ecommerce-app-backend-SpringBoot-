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

import com.example.for_angular_project.Entity.Admin;
import com.example.for_angular_project.Service.AdminSerive;
import com.example.for_angular_project.error.AdminNotFoundException;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {

   @Autowired
   AdminSerive adminSerive;

   @PostMapping("/postAdmin")
   public String postAdmin(@RequestBody Admin admin) {
      adminSerive.postAdmin(admin);
      return "Data Submited Successfully";

   }

   @GetMapping("/getAdmin/{id}")
   public Admin getAdminById(@PathVariable("id") Integer id) throws AdminNotFoundException {
      return adminSerive.getAdminById(id);
   }

   @GetMapping(value = "/getAdmin")
   public List<Admin> getMethodName() {
      return adminSerive.getAdminList();
   }

   @DeleteMapping(value = "/deleteAdmin/{id}")
   public String deleteAdminById(@PathVariable Integer id) {
      adminSerive.deleteAdminById(id);
      return "Data Deleted Successfully";
   }

   @PutMapping("/updateAdmin/{id}")

   public String updateAdminById(@PathVariable Integer id, @RequestBody Admin admin) {
      adminSerive.updateAdminById(id, admin);
      return "Data Update Successfully";
   }

}
