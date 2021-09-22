package com.smartinez.ciclo3back.models;

import java.util.List;
import java.util.Objects;

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


    public VentaModel() {
    }

    public VentaModel(Long id, ClienteModel cliente, List<ProductoModel> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return this.cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public List<ProductoModel> getProductos() {
        return this.productos;
    }

    public void setProductos(List<ProductoModel> productos) {
        this.productos = productos;
    }

    public VentaModel id(Long id) {
        setId(id);
        return this;
    }

    public VentaModel cliente(ClienteModel cliente) {
        setCliente(cliente);
        return this;
    }

    public VentaModel productos(List<ProductoModel> productos) {
        setProductos(productos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VentaModel)) {
            return false;
        }
        VentaModel ventaModel = (VentaModel) o;
        return Objects.equals(id, ventaModel.id) && Objects.equals(cliente, ventaModel.cliente) && Objects.equals(productos, ventaModel.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, productos);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", productos='" + getProductos() + "'" +
            "}";
    }

}
