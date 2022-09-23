package com.example.for_angular_project.Service;

import java.util.List;

import com.example.for_angular_project.Entity.Cart;

public interface CartService {

   public List<Cart> getCartList();

   public void postCart(Cart cart);

   public Cart getCartById(Integer id);

   public void updateCart(Integer id, Cart cart);

   public void deleteCart(Integer id);

}
