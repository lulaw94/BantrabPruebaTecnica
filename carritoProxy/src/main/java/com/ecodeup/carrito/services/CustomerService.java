package com.ecodeup.carrito.services;

import java.util.List;
import java.util.Optional;

import com.ecodeup.carrito.entity.Customer;

public interface CustomerService {

	public List<Customer> getcustomers();
	public Optional<Customer> getcustomer(int id);
}
