package com.example.NutreAppBack2.models.comunidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "favoritos")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "nota_personal", length = 255)
    private String notaPersonal;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    @Column(name = "permiso_edicion", length = 50)
    private String permisoEdicion;

    @Column(name = "orden_posicion")
    private Integer ordenPosicion;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_receta")
    private Integer idReceta;

    public Favorito() {
    }

    public Favorito(String notaPersonal, LocalDate fechaCreacion, String permisoEdicion,
                    Integer ordenPosicion, Integer idUsuario, Integer idReceta) {
        this.notaPersonal = notaPersonal;
        this.fechaCreacion = fechaCreacion;
        this.permisoEdicion = permisoEdicion;
        this.ordenPosicion = ordenPosicion;
        this.idUsuario = idUsuario;
        this.idReceta = idReceta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotaPersonal() {
        return notaPersonal;
    }

    public void setNotaPersonal(String notaPersonal) {
        this.notaPersonal = notaPersonal;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getPermisoEdicion() {
        return permisoEdicion;
    }

    public void setPermisoEdicion(String permisoEdicion) {
        this.permisoEdicion = permisoEdicion;
    }

    public Integer getOrdenPosicion() {
        return ordenPosicion;
    }

    public void setOrdenPosicion(Integer ordenPosicion) {
        this.ordenPosicion = ordenPosicion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }
}
