package com.smartinez.ciclo3back.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.smartinez.ciclo3back.models.ProductoModel;
import com.smartinez.ciclo3back.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping
    public ArrayList<ProductoModel> obtenerProductos() {
        return productoService.obtenerProductos();
    }

    @PostMapping
    public ProductoModel crearProducto(@RequestBody ProductoModel producto) {
        return productoService.guardarProducto(producto);
    }

    @GetMapping(path = "{id}")
    public Optional<ProductoModel> obtenerPorId(@PathVariable("id") Long id) {
        return productoService.obtenerOptional(id);
    }

    @DeleteMapping(path = "{id}")
    public String eliminarProductoPorId(@PathVariable("id") Long id) {
        boolean eliminado = productoService.eliminarProducto(id);
        if (eliminado) {
            return "Producto eliminado";
        } else {
            return "Error eliminando producto";
        }
    }
}
