package com.ecodeup.carrito.services.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecodeup.carrito.models.response.Product;
import com.ecodeup.carrito.services.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
    private RestTemplate restTemplate;
	@Override
	public List<Product> getAll() {
		String url = "https://fakestoreapi.com/products";
		Product[] products = restTemplate.getForObject(url, Product[].class);
	    return Arrays.asList(products);

	}

	@Override
	public Product getById(int id) {
		String url = "https://fakestoreapi.com/products";
		url = url+"/{id}";
		Product product = restTemplate.getForObject(url, Product.class, id);
	    return product;

	}

	
}
