package com.sazon.nutricion.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "objetivos_nutricionales")
public class ObjetivoNutricional {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "meta_calorias", nullable = false)
    private Integer metaCalorias;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_perfil_alimentario", nullable = false)
    @JsonBackReference(value = "perfilalimentario-objetivonutricional")
    private PerfilAlimentario perfilAlimentario;

    public ObjetivoNutricional() {
    }

    public ObjetivoNutricional(String descripcion, Integer metaCalorias,
                               LocalDate fechaInicio, LocalDate fechaFin) {
        this.descripcion = descripcion;
        this.metaCalorias = metaCalorias;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getMetaCalorias() {
        return metaCalorias;
    }

    public void setMetaCalorias(Integer metaCalorias) {
        this.metaCalorias = metaCalorias;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public PerfilAlimentario getPerfilAlimentario() {
        return perfilAlimentario;
    }

    public void setPerfilAlimentario(PerfilAlimentario perfilAlimentario) {
        this.perfilAlimentario = perfilAlimentario;
    }
}
