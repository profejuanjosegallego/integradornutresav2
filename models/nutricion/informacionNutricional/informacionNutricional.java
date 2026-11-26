package com.sazon.nutricion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "informacion_nutricional")
public class InformacionNutricional {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "calorias", nullable = false)
    private Double calorias;

    @Column(name = "proteinas_g", nullable = false)
    private Double proteinasG;

    @Column(name = "carbohidratos_g", nullable = false)
    private Double carbohidratosG;

    @Column(name = "grasas_g", nullable = false)
    private Double grasasG;

    @Column(name = "sodio_mg", nullable = false)
    private Double sodioMg;

    @Column(name = "id_producto", nullable = false)
    private UUID idProducto;

    // JPA requiere un constructor sin argumentos
    public InformacionNutricional() {
    }

    public InformacionNutricional(Double calorias, Double proteinasG, Double carbohidratosG,
                                  Double grasasG, Double sodioMg, UUID idProducto) {
        this.calorias = calorias;
        this.proteinasG = proteinasG;
        this.carbohidratosG = carbohidratosG;
        this.grasasG = grasasG;
        this.sodioMg = sodioMg;
        this.idProducto = idProducto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Double getProteinasG() {
        return proteinasG;
    }

    public void setProteinasG(Double proteinasG) {
        this.proteinasG = proteinasG;
    }

    public Double getCarbohidratosG() {
        return carbohidratosG;
    }

    public void setCarbohidratosG(Double carbohidratosG) {
        this.carbohidratosG = carbohidratosG;
    }

    public Double getGrasasG() {
        return grasasG;
    }

    public void setGrasasG(Double grasasG) {
        this.grasasG = grasasG;
    }

    public Double getSodioMg() {
        return sodioMg;
    }

    public void setSodioMg(Double sodioMg) {
        this.sodioMg = sodioMg;
    }

    public UUID getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(UUID idProducto) {
        this.idProducto = idProducto;
    }
}