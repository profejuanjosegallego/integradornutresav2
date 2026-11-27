package com.example.NutreAppBack2.models.comunidad;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "valoraciones")
public class Valoracion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "puntuacion", nullable = false)
    private Integer puntuacion;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Column(name = "recomendaria", nullable = false)
    private Boolean recomendaria;

    @Column(name = "idReceta", nullable = false)
    private UUID idReceta;

    @Column(name = "idUsuario", nullable = false)
    private UUID idUsuario;

    public Valoracion() {
    }


    public Valoracion(UUID id, Integer puntuacion, LocalDateTime fecha, Boolean recomendaria, UUID idReceta,
            UUID idUsuario) {
        this.id = id;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.recomendaria = recomendaria;
        this.idReceta = idReceta;
        this.idUsuario = idUsuario;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public Integer getPuntuacion() {
        return puntuacion;
    }


    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Boolean getRecomendaria() {
        return recomendaria;
    }


    public void setRecomendaria(Boolean recomendaria) {
        this.recomendaria = recomendaria;
    }


    public UUID getIdReceta() {
        return idReceta;
    }


    public void setIdReceta(UUID idReceta) {
        this.idReceta = idReceta;
    }


    public UUID getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }


    public List<Comentario> getComentarios() {
        return comentarios;
    }


    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
