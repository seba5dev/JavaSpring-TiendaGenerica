package com.smartinez.ciclo3back.repositories;

import com.smartinez.ciclo3back.models.ProductoModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<ProductoModel, Long> {
    
}
