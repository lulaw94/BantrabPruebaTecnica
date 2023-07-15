package com.ecodeup.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.carrito.entity.Detail;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer>{

}
