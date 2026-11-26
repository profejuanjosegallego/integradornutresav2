package com.example.NutreAppBack2.models.recetario;

import java.util.UUID;

import com.example.NutreAppBack2.models.helpers.UnidadMedida;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredientes_receta")
public class IngredienteReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre_ingrediente", nullable = false, length = 80)
    private String nombreIngrediente;

    @Column(name = "cantidad", nullable = false)
    private Double cantidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "unidad_medida", nullable = false)
    private UnidadMedida unidadMedida;

    @Column(name = "id_producto", nullable = true)
    private UUID idProducto;

    @ManyToOne
    @JoinColumn(name = "id_receta", nullable = false)
    @JsonBackReference(value = "receta-ingredientereceta")
    private Receta receta;

    public IngredienteReceta() {
    }

    public IngredienteReceta(UUID id, String nombreIngrediente, Double cantidad,
            UnidadMedida unidadMedida, UUID idProducto) {
        this.id = id;
        this.nombreIngrediente = nombreIngrediente;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.idProducto = idProducto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public UUID getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(UUID idProducto) {
        this.idProducto = idProducto;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
