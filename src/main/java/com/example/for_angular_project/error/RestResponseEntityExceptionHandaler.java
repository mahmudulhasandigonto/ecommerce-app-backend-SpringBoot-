package com.example.for_angular_project.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.for_angular_project.Entity.ErrorMessage;

/**
 * RestResponseEntityExceptionHandaler
 */
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandaler extends ResponseEntityExceptionHandler {

   @ExceptionHandler(AdminNotFoundException.class)
   public ResponseEntity<ErrorMessage> adminNotFoundException(AdminNotFoundException exception,
         WebRequest request) {
      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

   @ExceptionHandler(BrandNotFoundException.class)
   public ResponseEntity<ErrorMessage> brandNotFoundException(BrandNotFoundException exception, WebRequest request) {
      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

   @ExceptionHandler(CartNotFoundException.class)
   public ResponseEntity<ErrorMessage> cartNotFoundException(CartNotFoundException exception, WebRequest request) {
      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

   @ExceptionHandler(CategoryNotFoundException.class)
   public ResponseEntity<ErrorMessage> categoryNotFoundException(CategoryNotFoundException exception,
         WebRequest request) {
      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

   @ExceptionHandler(CustomerRegistrationNotFoundException.class)
   public ResponseEntity<ErrorMessage> customerRegistrationNotFoundException(
         CustomerRegistrationNotFoundException exception, WebRequest request) {

      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

   @ExceptionHandler(ProductNotFoundException.class)
   public ResponseEntity<ErrorMessage> productNotFoundException(ProductNotFoundException exception,
         WebRequest request) {
      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

   @ExceptionHandler(SliderNotFoundException.class)
   public ResponseEntity<ErrorMessage> sliderNotFoundException(SliderNotFoundException exception, WebRequest request) {

      ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
   }

}