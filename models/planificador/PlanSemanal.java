package models.planificador;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "planes_semanales")
public class PlanSemanal {

@Id
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;

@Column(name = "nombre", nullable = false, length = 100)
private String nombre;

@Column(name = "fecha_inicio", nullable = false)
private LocalDate fechaInicio;

@Column(name = "fecha_fin", nullable = false)
private LocalDate fechaFin;

@Column(name = "activo", nullable = false)
private Boolean activo;

    public PlanSemanal() {
    }

    public PlanSemanal(UUID id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}