package com.example.NutreAppBack2.models.mercadeo;

import com.example.NutreAppBack2.models.mercadeo.helpers.NivelFidelizacion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "cuentas_fidelizacion")
public class CuentaFidelizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "puntos_acumulados", nullable = false)
    private Integer puntosAcumulados;

    @Enumerated(EnumType.STRING)
    @Column(name = "nivel", nullable = false)
    private NivelFidelizacion nivel;

    @Column(name = "fecha_afiliacion", nullable = false)
    private LocalDate fechaAfiliacion;

    @Column(name = "id_usuario", nullable = false)
    private UUID idUsuario;

    public CuentaFidelizacion() {
    }

    public CuentaFidelizacion(UUID id, Integer puntosAcumulados, NivelFidelizacion nivel, LocalDate fechaAfiliacion, UUID idUsuario) {
        this.id = id;
        this.puntosAcumulados = puntosAcumulados;
        this.nivel = nivel;
        this.fechaAfiliacion = fechaAfiliacion;
        this.idUsuario = idUsuario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Integer puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public NivelFidelizacion getNivel() {
        return nivel;
    }

    public void setNivel(NivelFidelizacion nivel) {
        this.nivel = nivel;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }
}