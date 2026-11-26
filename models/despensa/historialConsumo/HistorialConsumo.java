package models.despensa.historialConsumo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "historial_consumo")
public class HistorialConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "cantidad_consumida", nullable = false)
    private Double cantidadConsumida;

    @Column(name = "fecha_consumo", nullable = false)
    private LocalDate fechaConsumo;

    @Column(name = "observacion", nullable = true, length = 255)
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "id_item_despensa", nullable = false)
    @JsonBackReference(value = "itemdespensa-historialconsumo")
    private ItemDespensa itemDespensa;

    public HistorialConsumo() {
    }

    public HistorialConsumo(
            UUID id,
            Double cantidadConsumida,
            LocalDate fechaConsumo,
            String observacion,
            ItemDespensa itemDespensa) {
        this.id = id;
        this.cantidadConsumida = cantidadConsumida;
        this.fechaConsumo = fechaConsumo;
        this.observacion = observacion;
        this.itemDespensa = itemDespensa;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getCantidadConsumida() {
        return cantidadConsumida;
    }

    public void setCantidadConsumida(Double cantidadConsumida) {
        this.cantidadConsumida = cantidadConsumida;
    }

    public LocalDate getFechaConsumo() {
        return fechaConsumo;
    }

    public void setFechaConsumo(LocalDate fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public ItemDespensa getItemDespensa() {
        return itemDespensa;
    }

    public void setItemDespensa(ItemDespensa itemDespensa) {
        this.itemDespensa = itemDespensa;
    }
}