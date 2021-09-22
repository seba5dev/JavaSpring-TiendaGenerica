package com.smartinez.ciclo3back.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(unique = true, nullable = false)
    private String codigo;
    private String nombre;
    private float precio;

    public ProductoModel() {
    }

    public ProductoModel(Long id, String codigo, String nombre, float precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ProductoModel id(Long id) {
        setId(id);
        return this;
    }

    public ProductoModel codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public ProductoModel nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public ProductoModel precio(float precio) {
        setPrecio(precio);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoModel)) {
            return false;
        }
        ProductoModel productoModel = (ProductoModel) o;
        return Objects.equals(id, productoModel.id) && Objects.equals(codigo, productoModel.codigo)
                && Objects.equals(nombre, productoModel.nombre) && precio == productoModel.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, nombre, precio);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", codigo='" + getCodigo() + "'" + ", nombre='" + getNombre() + "'"
                + ", precio='" + getPrecio() + "'" + "}";
    }

}
