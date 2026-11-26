package com.sazon.models.catalogo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "imagenes_producto")
public class ImagenProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "url", nullable = false, length = 255)
    private String url;

    @Column(name = "texto_alternativo", nullable = false, length = 120)
    private String textoAlternativo;

    @Column(name = "es_principal", nullable = false)
    private Boolean esPrincipal;

    @Column(name = "orden", nullable = false)
    private Integer orden;


    public ImagenProducto() {
    }

    public ImagenProducto(UUID id, String url, String textoAlternativo, Boolean esPrincipal, Integer orden) {
        this.id = id;
        this.url = url;
        this.textoAlternativo = textoAlternativo;
        this.esPrincipal = esPrincipal;
        this.orden = orden;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTextoAlternativo() {
        return textoAlternativo;
    }

    public void setTextoAlternativo(String textoAlternativo) {
        this.textoAlternativo = textoAlternativo;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

   
}