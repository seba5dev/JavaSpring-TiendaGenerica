package com.smartinez.ciclo3back.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ClienteModel cliente;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "venta_productos",
        joinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "venta_id", referencedColumnName = "id"))
        private List<ProductoModel> productos;
}
