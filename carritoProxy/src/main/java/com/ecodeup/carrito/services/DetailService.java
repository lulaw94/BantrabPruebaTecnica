package com.ecodeup.carrito.services;

import java.util.Optional;

import com.ecodeup.carrito.entity.Detail;

public interface DetailService {
    public Optional<Detail> getdetail(Integer id);
}
