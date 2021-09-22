package com.smartinez.ciclo3back.services;

import java.util.Optional;
import java.util.ArrayList;

import com.smartinez.ciclo3back.models.ProductoModel;
import com.smartinez.ciclo3back.repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository ProductoRepository;

    // CREATE, UPDATE
    public ProductoModel guardarProducto(ProductoModel Producto) {
        return ProductoRepository.save(Producto);
    }

    // READ
    public Optional<ProductoModel> obtenerOptional(Long id) {
        return ProductoRepository.findById(id);
    }

    // LIST ALL
    public ArrayList<ProductoModel> obtenerProductos() {
        return (ArrayList<ProductoModel>) ProductoRepository.findAll();
    }

    // DELETE
    public boolean eliminarProducto(Long id) {
        try {
            ProductoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
            // TODO: handle exception
        }
    }
}
