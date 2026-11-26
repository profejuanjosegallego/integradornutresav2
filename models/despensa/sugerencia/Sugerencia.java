package com.sazon.despensa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "sugerencias")
public class Sugerencia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "fecha_generacion", nullable = false)
    private LocalDateTime fechaGeneracion;

    @Column(name = "porcentaje_coincidencia", nullable = false)
    private Double porcentajeCoincidencia;

    @Column(name = "aceptada", nullable = false)
    private Boolean aceptada;

    @Column(name = "id_receta", nullable = false)
    private UUID idReceta;

    @ManyToOne
    @JoinColumn(name = "id_despensa", nullable = false)
    @JsonBackReference(value = "despensa-sugerencia")
    private Despensa despensa;

    // Constructor vacío obligatorio para JPA
    public Sugerencia() {
    }

    // Constructor con parámetros (sin id, ya que lo genera JPA automáticamente)
    public Sugerencia(LocalDateTime fechaGeneracion, Double porcentajeCoincidencia, Boolean aceptada, UUID idReceta, Despensa despensa) {
        this.fechaGeneracion = fechaGeneracion;
        this.porcentajeCoincidencia = porcentajeCoincidencia;
        this.aceptada = aceptada;
        this.idReceta = idReceta;
        this.despensa = despensa;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Double getPorcentajeCoincidencia() {
        return porcentajeCoincidencia;
    }

    public void setPorcentajeCoincidencia(Double porcentajeCoincidencia) {
        this.porcentajeCoincidencia = porcentajeCoincidencia;
    }

    public Boolean getAceptada() {
        return aceptada;
    }

    public void setAceptada(Boolean aceptada) {
        this.aceptada = aceptada;
    }

    public UUID getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(UUID idReceta) {
        this.idReceta = idReceta;
    }

    public Despensa getDespensa() {
        return despensa;
    }

    public void setDespensa(Despensa despensa) {
        this.despensa = despensa;
    }
}