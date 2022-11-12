package com.example.for_angular_project.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.for_angular_project.Entity.Cart;
import com.example.for_angular_project.Repository.CartRepository;
import com.example.for_angular_project.error.CartNotFoundException;

@Service
public class CartServiceImp implements CartService {

   @Autowired
   CartRepository cartRepository;

   @Override
   public void deleteCart(Integer id) {
      cartRepository.deleteById(id);
   }

   @Override
   public Cart getCartById(Integer id) throws CartNotFoundException {
      Optional<Cart> cart = cartRepository.findById(id);
      if (!cart.isPresent()) {
         throw new CartNotFoundException("Cart not found");
      }

      return cart.get();
   }

   @Override
   public List<Cart> getCartList() {
      return cartRepository.findAll();
   }

   @Override
   public void postCart(Cart cart) {
      cartRepository.save(cart);
   }

   @Override
   public void updateCart(Integer id, Cart cart) {
      Cart cartDemo = cartRepository.findById(id).get();

      if (Objects.nonNull(cart.getProductName()) && !"".equalsIgnoreCase(cart.getProductName())) {
         cartDemo.setProductName(cart.getProductName());
      }

      cartDemo.setProductId(cart.getProductId());
      cartDemo.setProductPrice(cart.getProductPrice());
      cartDemo.setQuantity(cart.getQuantity());
      cartDemo.setImageUrl(cart.getImageUrl());

      cartRepository.save(cartDemo);
   }

}
