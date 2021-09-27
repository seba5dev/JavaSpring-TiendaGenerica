package com.smartinez.ciclo3back.dao;

import com.smartinez.ciclo3back.models.ProductoModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends CrudRepository<ProductoModel, Long> {
    
}
