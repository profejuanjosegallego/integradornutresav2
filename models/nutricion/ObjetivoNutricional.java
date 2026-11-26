package com.sazon.nutricion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
