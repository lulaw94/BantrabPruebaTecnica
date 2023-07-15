package com.ecodeup.carrito.services;

import java.util.List;
import java.util.Optional;


import com.ecodeup.carrito.entity.Order;

public interface OrderService {

	public List<Order> getorders();
	public Optional<Order> getorder(int id);
}
