package com.sazon.catalogo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "descripcion", nullable = true, length = 255)
    private String descripcion;

    @Column(name = "pais_origen", nullable = false, length = 40)
    private String paisOrigen;

    @Column(name = "url_logo", nullable = true, length = 255)
    private String urlLogo;

    @Column(name = "activa", nullable = false)
    private Boolean activa;

    @Column(name = "id_usuario_creador", nullable = false)
    private UUID idUsuarioCreador;

    @OneToMany(mappedBy = "marca")
    @JsonManagedReference(value = "marca-producto")
    private List<Producto> productos;

    
    public Marca() {
    }

    
    public Marca(String nombre, String descripcion, String paisOrigen, String urlLogo, Boolean activa, UUID idUsuarioCreador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.paisOrigen = paisOrigen;
        this.urlLogo = urlLogo;
        this.activa = activa;
        this.idUsuarioCreador = idUsuarioCreador;
    }

    
    public Marca(UUID id, String nombre, String descripcion, String paisOrigen, String urlLogo, Boolean activa, UUID idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.paisOrigen = paisOrigen;
        this.urlLogo = urlLogo;
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

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
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