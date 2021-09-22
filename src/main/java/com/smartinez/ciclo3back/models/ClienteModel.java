package com.smartinez.ciclo3back.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;

    public ClienteModel() {
    }

    public ClienteModel(Long id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ClienteModel id(Long id) {
        setId(id);
        return this;
    }

    public ClienteModel nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public ClienteModel email(String email) {
        setEmail(email);
        return this;
    }

    public ClienteModel telefono(String telefono) {
        setTelefono(telefono);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClienteModel)) {
            return false;
        }
        ClienteModel clienteModel = (ClienteModel) o;
        return Objects.equals(id, clienteModel.id) && Objects.equals(nombre, clienteModel.nombre)
                && Objects.equals(email, clienteModel.email) && Objects.equals(telefono, clienteModel.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, email, telefono);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", email='" + getEmail() + "'"
                + ", telefono='" + getTelefono() + "'" + "}";
    }

}
