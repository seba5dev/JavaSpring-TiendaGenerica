package com.smartinez.ciclo3back.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.smartinez.ciclo3back.models.ClienteModel;
import com.smartinez.ciclo3back.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ArrayList<ClienteModel> obtenerClientes() {
        return clienteService.obtenerClientes();
    }

    @PostMapping
    public ClienteModel crearCliente(@RequestBody ClienteModel cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @GetMapping(path = "{id}")
    public Optional<ClienteModel> obtenerPorId(@PathVariable("id") Long id) {
        return clienteService.obtenerOptional(id);
    }

    @DeleteMapping(path = "{id}")
    public String eliminarClientePorId(@PathVariable("id") Long id) {
        boolean eliminado = clienteService.eliminarCliente(id);
        if (eliminado) {
            return "Cliente eliminado";
        } else {
            return "Error eliminando cliente";
        }
    }
}
