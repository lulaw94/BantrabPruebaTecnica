package com.ecodeup.carrito.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ecodeup.carrito.entity.Detail;
import com.ecodeup.carrito.services.DetailService;

@RestController
@RequestMapping("/Detail")
public class DetailController {
@Autowired
private DetailService detailservice;

@GetMapping("/{id}")
public ResponseEntity<?> getdetail(@PathVariable("id") int id){
	Optional<Detail> detail = detailservice.getdetail(id);
	return new ResponseEntity<>(detail.get(), HttpStatus.OK);
}

}
