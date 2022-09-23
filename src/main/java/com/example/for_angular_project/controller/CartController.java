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

import com.example.for_angular_project.Entity.Cart;
import com.example.for_angular_project.Service.CartService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CartController {

   @Autowired
   CartService cartService;

   @PostMapping("/postCart")
   @CrossOrigin(origins = "http://localhost:4200")

   public String postCart(@RequestBody Cart cart) {
      cartService.postCart(cart);
      return "Data Submited Successfully";
   }

   @GetMapping("/getCart")
   @CrossOrigin(origins = "http://localhost:4200")

   public List<Cart> getCartList() {
      return cartService.getCartList();
   }

   @GetMapping("/getCartById/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public Cart getCartById(@PathVariable Integer id) {
      return cartService.getCartById(id);
   }

   @PutMapping("/updateCart/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String updateCart(@PathVariable("id") Integer id, @RequestBody Cart cart) {
      cartService.updateCart(id, cart);
      return "Data Update Successfully";
   }

   @DeleteMapping("/deleteCart/{id}")
   @CrossOrigin(origins = "http://localhost:4200")

   public String deleteCart(@PathVariable Integer id) {
      cartService.deleteCart(id);
      return "Data Delete Successfully";
   }
}
