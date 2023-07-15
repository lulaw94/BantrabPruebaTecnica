package com.ecodeup.carrito.services;

import java.util.List;

import com.ecodeup.carrito.models.response.Product;

public interface ProductService {

	public List<Product> getAll();
	
	public Product getById (int id);
		
}
