package com.smartinez.ciclo3back.dao;

import com.smartinez.ciclo3back.models.VentaModel;

import org.springframework.data.repository.CrudRepository;

public interface VentaRepository extends CrudRepository<VentaModel, Long> {
    
}
