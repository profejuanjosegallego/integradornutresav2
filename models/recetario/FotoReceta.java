package models.recetario;
package com.sazon.recetario.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "fotos_receta")
public class FotoReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "url", nullable = false, length = 255)
    private String url;

    @Column(name = "descripcion", nullable = true, length = 150)
    private String descripcion;

    @Column(name = "es_portada", nullable = false)
    private Boolean esPortada;

    public FotoReceta() {
    }

    public FotoReceta(String url, String descripcion, Boolean esPortada) {
        this.url = url;
        this.descripcion = descripcion;
        this.esPortada = esPortada;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEsPortada() {
        return esPortada;
    }

    public void setEsPortada(Boolean esPortada) {
        this.esPortada = esPortada;
    }
}
