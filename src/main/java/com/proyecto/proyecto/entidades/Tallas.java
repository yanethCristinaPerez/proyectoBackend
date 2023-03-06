package com.proyecto.proyecto.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tallas")
public class Tallas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tallas", nullable = false)
    private Long idTallas;

    @Column(name = "talla")
    private String talla;

    public Tallas() {
    }

    public Tallas(String talla) {
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Long getIdTallas() {
        return idTallas;
    }

    public void setIdTallas(Long idTallas) {
        this.idTallas = idTallas;
    }
}
