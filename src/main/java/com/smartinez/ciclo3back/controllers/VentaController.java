package com.smartinez.ciclo3back.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.smartinez.ciclo3back.models.VentaModel;
import com.smartinez.ciclo3back.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService ventaService;

    @GetMapping
    public ArrayList<VentaModel> obtenerVentas() {
        return ventaService.obtenerVentas();
    }

    @PostMapping
    public VentaModel crearVenta(@RequestBody VentaModel venta) {
        return ventaService.guardarVenta(venta);
    }

    @GetMapping(path = "{id}")
    public Optional<VentaModel> obtenerPorId(@PathVariable("id") Long id) {
        return ventaService.obtenerOptional(id);
    }

    @DeleteMapping(path = "{id}")
    public String eliminarVentaPorId(@PathVariable("id") Long id) {
        boolean eliminado = ventaService.eliminarVenta(id);
        if (eliminado) {
            return "Venta eliminado";
        } else {
            return "Error eliminando venta";
        }
    }
}
