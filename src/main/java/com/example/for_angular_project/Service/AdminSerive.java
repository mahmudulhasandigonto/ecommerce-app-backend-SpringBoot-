package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Admin;
import com.example.for_angular_project.error.AdminNotFoundException;

public interface AdminSerive {

   public void postAdmin(Admin admin);

   public List<Admin> getAdminList();

   public void deleteAdminById(Integer id);

   public void updateAdminById(Integer id, Admin admin);

   public Admin getAdminById(Integer id) throws AdminNotFoundException;

}
