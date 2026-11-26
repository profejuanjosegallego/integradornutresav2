package com.example.NutreAppBack2.models.nutricion;

import java.util.List;
import java.util.UUID;

import com.example.NutreAppBack2.models.nutricion.helpers.NivelRiesgo;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alergenos")
public class Alergeno {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "descripcion", nullable = true, length = 255)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_riesgo", nullable = false)
    private NivelRiesgo nivelRiesgo;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    // Usuario creador: pertenece a otro módulo, solo se guarda el id
    @Column(name = "id_usuario_creador", nullable = false)
    private UUID idUsuarioCreador;

    // Relaciones 1 a muchos
    @OneToMany(mappedBy = "alergeno")
    @JsonManagedReference(value = "alergeno-restriccionperfil")
    private List<RestriccionPerfil> restricciones;

    @OneToMany(mappedBy = "alergeno")
    @JsonManagedReference(value = "alergeno-informacionnutricional")
    private List<InformacionNutricional> informacionesNutricionales;

    // Constructores
    public Alergeno() {
    }

    public Alergeno(UUID id, String nombre, String descripcion, NivelRiesgo nivelRiesgo, Boolean activo,
            UUID idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
        this.activo = activo;
        this.idUsuarioCreador = idUsuarioCreador;
    }

    // Getters y setters
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(NivelRiesgo nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public UUID getIdUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIdUsuarioCreador(UUID idUsuarioCreador) {
        this.idUsuarioCreador = idUsuarioCreador;
    }

    public List<RestriccionPerfil> getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(List<RestriccionPerfil> restricciones) {
        this.restricciones = restricciones;
    }

    public List<InformacionNutricional> getInformacionesNutricionales() {
        return informacionesNutricionales;
    }

    public void setInformacionesNutricionales(List<InformacionNutricional> informacionesNutricionales) {
        this.informacionesNutricionales = informacionesNutricionales;
    }
}
