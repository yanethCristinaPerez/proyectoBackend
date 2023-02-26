package com.proyecto.proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name="log_catalog")
public class LogCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long id_product_catalog;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_product_catalog() {
        return id_product_catalog;
    }

    public void setId_product_catalog(Long id_product_catalog) {
        this.id_product_catalog = id_product_catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
