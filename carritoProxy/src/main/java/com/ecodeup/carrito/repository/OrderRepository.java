package com.ecodeup.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.carrito.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
