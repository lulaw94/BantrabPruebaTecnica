package com.ecodeup.carrito.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecodeup.carrito.entity.Customer;
import com.ecodeup.carrito.repository.CustomerRepository;
import com.ecodeup.carrito.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{	
@Autowired
private CustomerRepository customerRepository;

@Override
public List<Customer> getcustomers() {
	// TODO Auto-generated method stub
	return customerRepository.findAll();
}

@Override
public Optional<Customer> getcustomer(int id) {
	// TODO Auto-generated method stub
	return customerRepository.findById(id);
}
  
	
}
