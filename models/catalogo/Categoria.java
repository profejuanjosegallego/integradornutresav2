package com.example.NutreAppBack2.models.catalogo;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "descripcion", nullable = true, length = 255)
    private String descripcion;

    @Column(name = "url_icono", nullable = true, length = 255)
    private String urlIcono;

    @Column(name = "activa", nullable = false)
    private Boolean activa;

    // Id del usuario: NO es relación, porque Usuario vive en otro grupo
    @Column(name = "id_usuario_creador", nullable = false)
    private UUID idUsuarioCreador;

    // Relación 1 a muchos con Producto (lado UNO)
    @OneToMany(mappedBy = "categoria")
    @JsonManagedReference(value = "categoria-producto")
    private List<Producto> productos;

    public Categoria() {
    }

    public Categoria(UUID id, String nombre, String descripcion, String urlIcono,
                     Boolean activa, UUID idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlIcono = urlIcono;
        this.activa = activa;
        this.idUsuarioCreador = idUsuarioCreador;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlIcono() {
        return urlIcono;
    }

    public void setUrlIcono(String urlIcono) {
        this.urlIcono = urlIcono;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public UUID getIdUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIdUsuarioCreador(UUID idUsuarioCreador) {
        this.idUsuarioCreador = idUsuarioCreador;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}