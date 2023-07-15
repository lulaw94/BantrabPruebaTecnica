package com.ecodeup.carrito.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.carrito.entity.Customer;
import com.ecodeup.carrito.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
@Autowired
private CustomerService customerService;
	
@GetMapping("")	
 public  ResponseEntity<?> getCustomers(){
	List<Customer> customers = customerService.getcustomers();
	return new ResponseEntity<>(customers, HttpStatus.OK);
}

@GetMapping("/{id}")
public ResponseEntity<?> getCustomer(@PathVariable("id") int id){
	Optional<Customer> customer = customerService.getcustomer(id);
	if(customer.isPresent()) {
		return new ResponseEntity<>(customer.get(), HttpStatus.OK);
	}
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}
