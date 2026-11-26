package com.sazon.recetario.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pasos_receta")
public class PasoReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "numero_paso", nullable = false)
    private Integer numeroPaso;

    @Column(name = "instruccion", nullable = false, length = 500)
    private String instruccion;

    @Column(name = "duracion_min", nullable = true)
    private Integer duracionMin;

    public PasoReceta() {}

    
    public PasoReceta(Integer numeroPaso, String instruccion, Integer duracionMin) {
        this.numeroPaso = numeroPaso;
        this.instruccion = instruccion;
        this.duracionMin = duracionMin;
    }

    public UUID getId() { return id; }

    public void setId(UUID id) { this.id = id; }

    public Integer getNumeroPaso() { return numeroPaso; }

    public void setNumeroPaso(Integer numeroPaso) { this.numeroPaso = numeroPaso; }

    public String getInstruccion() { return instruccion; }

    public void setInstruccion(String instruccion) { this.instruccion = instruccion; }

    public Integer getDuracionMin() { return duracionMin; }

    public void setDuracionMin(Integer duracionMin) { this.duracionMin = duracionMin; }

    
}
