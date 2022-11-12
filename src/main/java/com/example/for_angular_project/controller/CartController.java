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
import com.example.for_angular_project.error.CartNotFoundException;

@RestController
@CrossOrigin(origins = "*")

public class CartController {

   @Autowired
   CartService cartService;

   @PostMapping("/postCart")
   public String postCart(@RequestBody Cart cart) {
      cartService.postCart(cart);
      return "Data Submited Successfully";
   }

   @GetMapping("/getCart")
   public List<Cart> getCartList() {
      return cartService.getCartList();
   }

   @GetMapping("/getCartById/{id}")
   public Cart getCartById(@PathVariable Integer id) throws CartNotFoundException {
      return cartService.getCartById(id);
   }

   @PutMapping("/updateCart/{id}")
   public String updateCart(@PathVariable("id") Integer id, @RequestBody Cart cart) {
      cartService.updateCart(id, cart);
      return "Data Update Successfully";
   }

   @DeleteMapping("/deleteCart/{id}")
   public String deleteCart(@PathVariable Integer id) {
      cartService.deleteCart(id);
      return "Data Delete Successfully";
   }
}
