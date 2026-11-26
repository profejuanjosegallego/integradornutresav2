package com.example.NutreAppBack2.models.despensa;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alertas_vencimiento")
public class AlertaVencimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "mensaje", nullable = false, length = 200)
    private String mensaje;

    @Column(name = "fecha_alerta", nullable = false)
    private LocalDate fechaAlerta;

    @Column(name = "dias_restantes", nullable = false)
    private Integer díasRestantes;

    @Column(name = "leida", nullable = false)
    private Boolean leida;


    public AlertaVencimiento() {
    }

    public AlertaVencimiento(UUID id, String mensaje, LocalDate fechaAlerta, Integer díasRestantes, Boolean leida) {
        this.id = id;
        this.mensaje = mensaje;
        this.fechaAlerta = fechaAlerta;
        this.díasRestantes = díasRestantes;
        this.leida = leida;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaAlerta() {
        return fechaAlerta;
    }

    public void setFechaAlerta(LocalDate fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }

    public Integer getDíasRestantes() {
        return díasRestantes;
    }

    public void setDíasRestantes(Integer díasRestantes) {
        this.díasRestantes = díasRestantes;
    }

    public Boolean getLeida() {
        return leida;
    }

    public void setLeida(Boolean leida) {
        this.leida = leida;
    }


    @Override
    public String toString() {
        return "AlertaVencimiento [id=" + id
                + ", mensaje=" + mensaje
                + ", fechaAlerta=" + fechaAlerta
                + ", díasRestantes=" + díasRestantes
                + ", leida=" + leida + "]";
    }

}