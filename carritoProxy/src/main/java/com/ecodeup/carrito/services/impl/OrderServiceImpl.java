package com.ecodeup.carrito.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.carrito.entity.Order;
import com.ecodeup.carrito.repository.OrderRepository;
import com.ecodeup.carrito.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
@Autowired
private OrderRepository orderRepsitory;
	@Override
	public List<Order> getorders() {
		// TODO Auto-generated method stub
		return orderRepsitory.findAll();
		}

	@Override
	public Optional<Order> getorder(int id) {
		// TODO Auto-generated method stub
		return orderRepsitory.findById(id);
	}

}
