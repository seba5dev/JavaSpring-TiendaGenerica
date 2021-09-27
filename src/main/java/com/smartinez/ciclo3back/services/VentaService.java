package com.smartinez.ciclo3back.services;

import java.util.Optional;
import java.util.ArrayList;

import com.smartinez.ciclo3back.dao.VentaRepository;
import com.smartinez.ciclo3back.models.VentaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    VentaRepository VentaRepository;

    // CREATE, UPDATE
    public VentaModel guardarVenta(VentaModel Venta) {
        return VentaRepository.save(Venta);
    }

    // READ
    public Optional<VentaModel> obtenerOptional(Long id) {
        return VentaRepository.findById(id);
    }

    // LIST ALL
    public ArrayList<VentaModel> obtenerVentas() {
        return (ArrayList<VentaModel>) VentaRepository.findAll();
    }

    // DELETE
    public boolean eliminarVenta(Long id) {
        try {
            VentaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            // TODO: handle exception
        }
    }
}
