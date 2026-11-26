package com.sazon.nutricion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "objetivos_nutricionales")
public class ObjetivoNutricional {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
