package com.smartinez.ciclo3back.services;

import java.util.Optional;
import java.util.ArrayList;

import com.smartinez.ciclo3back.models.ClienteModel;
import com.smartinez.ciclo3back.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    // CREATE, UPDATE
    public ClienteModel guardarCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    // READ
    public Optional<ClienteModel> obtenerOptional(Long id) {
        return clienteRepository.findById(id);
    }

    // LIST ALL
    public ArrayList<ClienteModel> obtenerClientes() {
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
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
