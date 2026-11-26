package com.sazon.planificador.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "listas_mercado")
public class ListaMercado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreación;

    @Column(name = "presupuesto", nullable = true)
    private Double presupuesto;

    @Column(name = "completada", nullable = false)
    private Boolean completada;

    @ManyToOne
    @JoinColumn(name = "id_plan_semanal", nullable = false)
    @JsonBackReference(value = "plansemanal-listamercado")
    private PlanSemanal planSemanal;

    @OneToMany(mappedBy = "listaMercado")
    @JsonManagedReference(value = "listamercado-itemlistamercado")
    private List<ÍtemListaMercado> ítems;

    @OneToMany(mappedBy = "listaMercado")
    @JsonManagedReference(value = "listamercado-recordatoriocompra")
    private List<RecordatorioCompra> recordatorios;

    public ListaMercado() {
    }

    public ListaMercado(UUID id, String nombre, LocalDate fechaCreación, Double presupuesto, Boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreación = fechaCreación;
        this.presupuesto = presupuesto;
        this.completada = completada;
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

    public LocalDate getFechaCreación() {
        return fechaCreación;
    }

    public void setFechaCreación(LocalDate fechaCreación) {
        this.fechaCreación = fechaCreación;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }

    public PlanSemanal getPlanSemanal() {
        return planSemanal;
    }

    public void setPlanSemanal(PlanSemanal planSemanal) {
        this.planSemanal = planSemanal;
    }

    public List<ÍtemListaMercado> getÍtems() {
        return ítems;
    }

    public void setÍtems(List<ÍtemListaMercado> ítems) {
        this.ítems = ítems;
    }

    public List<RecordatorioCompra> getRecordatorios() {
        return recordatorios;
    }

    public void setRecordatorios(List<RecordatorioCompra> recordatorios) {
        this.recordatorios = recordatorios;
    }
}