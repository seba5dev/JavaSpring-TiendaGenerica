package com.smartinez.ciclo3back.dao;

import com.smartinez.ciclo3back.models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<UsuarioModel, Long> {
    
}
