package com.smartinez.ciclo3back.repositories;

import com.smartinez.ciclo3back.models.ClienteModel;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {
    
}
