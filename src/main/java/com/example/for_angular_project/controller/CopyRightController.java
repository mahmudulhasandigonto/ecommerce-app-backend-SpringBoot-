package com.example.for_angular_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.for_angular_project.Entity.CopyRight;
import com.example.for_angular_project.Service.CopyRightService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CopyRightController {

   @Autowired
   CopyRightService copyRightService;

   @PostMapping("/postCopyRight")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postCopyRight(@RequestBody CopyRight copyRight) {
      copyRightService.postCopyRight(copyRight);
      return "Data submitted successfully";
   }

   @GetMapping("/getCopyRight")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<CopyRight> getCopyRight() {
      return copyRightService.getCopyRights();
   }

   @GetMapping("/getCopyRight/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public CopyRight getCopyRight(@PathVariable("id") Integer id) {
      return copyRightService.getCopyRight(id);
   }

   @PutMapping("/updateCopyRight/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateCopyRight(@PathVariable("id") Integer id, @RequestBody CopyRight copyRight) {
      copyRightService.updateCopyRight(id, copyRight);
      return "Data Updated successfully";
   }
}
