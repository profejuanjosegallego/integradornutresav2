package com.sazon.comunidad.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "colecciones")
public class Colección {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "descripcion", nullable = true, length = 255)
    private String descripción;

    @Column(name = "publica", nullable = false)
    private Boolean pública;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreación;

    @Column(name = "id_usuario", nullable = false)
    private UUID idUsuario;

   

    public Colección() {
    }

    public Colección(UUID id, String nombre, String descripción, Boolean pública,
                     LocalDate fechaCreación, UUID idUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.pública = pública;
        this.fechaCreación = fechaCreación;
        this.idUsuario = idUsuario;
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

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Boolean getPública() {
        return pública;
    }

    public void setPública(Boolean pública) {
        this.pública = pública;
    }

    public LocalDate getFechaCreación() {
        return fechaCreación;
    }

    public void setFechaCreación(LocalDate fechaCreación) {
        this.fechaCreación = fechaCreación;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

   
}
