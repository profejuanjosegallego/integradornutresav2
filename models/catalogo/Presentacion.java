package com.sazon.models.catalogo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sazon.models.helpers.EstadoPresentacion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "presentaciones")
public class Presentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;

    @Column(name = "tamano", nullable = true, length = 80)
    private String tamano;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 30)
    private EstadoPresentacion estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false)
    @JsonBackReference("producto-presentaciones")
    private Producto producto;

    public Presentacion() {
    }

    public Presentacion(String nombre, String tamano, Double precio, EstadoPresentacion estado) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
        this.estado = estado;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public EstadoPresentacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoPresentacion estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}