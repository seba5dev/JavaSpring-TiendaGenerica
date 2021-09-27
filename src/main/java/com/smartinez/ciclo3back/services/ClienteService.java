package com.smartinez.ciclo3back.services;

import java.util.Optional;
import java.util.ArrayList;

import com.smartinez.ciclo3back.dao.UsuarioDAO;
import com.smartinez.ciclo3back.models.UsuarioModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    UsuarioDAO clienteRepository;

    // CREATE, UPDATE
    public UsuarioModel guardarCliente(UsuarioModel cliente) {
        return clienteRepository.save(cliente);
    }

    // READ
    public Optional<UsuarioModel> obtenerOptional(Long id) {
        return clienteRepository.findById(id);
    }

    // LIST ALL
    public ArrayList<UsuarioModel> obtenerClientes() {
        return (ArrayList<UsuarioModel>) clienteRepository.findAll();
    }

    // DELETE
    public boolean eliminarCliente(Long id) {
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            // TODO: handle exception
        }
    }
}
