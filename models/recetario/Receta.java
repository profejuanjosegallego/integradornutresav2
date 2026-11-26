package com.sazon.recetario.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "tiempo_preparacion_min", nullable = false)
    private Integer tiempoPreparacionMin;

    @Column(name = "porciones", nullable = false)
    private Integer porciones;

    @Column(name = "id_categoria_receta", nullable = false)
    private UUID idCategoriaReceta;

    @Column(name = "id_usuario_autor", nullable = false)
    private UUID idUsuarioAutor;

    public Receta() {
    }

    public Receta(UUID id, String titulo, String descripcion, Integer tiempoPreparacionMin, Integer porciones,
            UUID idCategoriaReceta, UUID idUsuarioAutor) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tiempoPreparacionMin = tiempoPreparacionMin;
        this.porciones = porciones;
        this.idCategoriaReceta = idCategoriaReceta;
        this.idUsuarioAutor = idUsuarioAutor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoPreparacionMin() {
        return tiempoPreparacionMin;
    }

    public void setTiempoPreparacionMin(Integer tiempoPreparacionMin) {
        this.tiempoPreparacionMin = tiempoPreparacionMin;
    }

    public Integer getPorciones() {
        return porciones;
    }

    public void setPorciones(Integer porciones) {
        this.porciones = porciones;
    }

    public UUID getIdCategoriaReceta() {
        return idCategoriaReceta;
    }

    public void setIdCategoriaReceta(UUID idCategoriaReceta) {
        this.idCategoriaReceta = idCategoriaReceta;
    }

    public UUID getIdUsuarioAutor() {
        return idUsuarioAutor;
    }

    public void setIdUsuarioAutor(UUID idUsuarioAutor) {
        this.idUsuarioAutor = idUsuarioAutor;
    }

    @Override
    public String toString() {
        return "Receta [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion
                + ", tiempoPreparacionMin=" + tiempoPreparacionMin + ", porciones=" + porciones
                + ", idCategoriaReceta=" + idCategoriaReceta + ", idUsuarioAutor=" + idUsuarioAutor + "]";
    }
}