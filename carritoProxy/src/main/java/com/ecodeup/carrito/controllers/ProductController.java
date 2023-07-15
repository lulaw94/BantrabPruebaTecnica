package com.ecodeup.carrito.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.carrito.models.response.Product;
import com.ecodeup.carrito.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public ResponseEntity<?> getProducts(){
	    List<Product> products = productService.getAll();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getuniqueProduct(@PathVariable("id") int id){
		 Product product = productService.getById(id);
		 return new ResponseEntity<>(product, HttpStatus.OK);
	}
         
}
