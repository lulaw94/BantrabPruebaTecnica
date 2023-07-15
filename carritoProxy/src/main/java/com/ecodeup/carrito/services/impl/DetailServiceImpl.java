package com.ecodeup.carrito.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.carrito.entity.Detail;
import com.ecodeup.carrito.repository.DetailRepository;
import com.ecodeup.carrito.services.DetailService;
@Service
public class DetailServiceImpl implements DetailService{
	
@Autowired
private DetailRepository detailRepository;

@Override
public Optional<Detail> getdetail(Integer id) {
	// TODO Auto-generated method stub
	return detailRepository.findById(id);
}

}
