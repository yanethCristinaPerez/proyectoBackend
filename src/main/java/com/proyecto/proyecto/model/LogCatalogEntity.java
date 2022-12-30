package com.proyecto.proyecto.model;


import jakarta.persistence.*;

@Entity
@Table(name="log_catalog")
public class LogCatalogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_log_catalog", nullable = false)
    private Long idLogCatalog;

    @ManyToOne
    @JoinColumn(name = "catalog_id_product_catalog")
    private CatalogEntity catalog;

    @Column(name = "counter")
    private Integer counter;

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public CatalogEntity getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogEntity catalog) {
        this.catalog = catalog;
    }


    public Long getIdLogCatalog() {
        return idLogCatalog;
    }

    public void setIdLogCatalog(Long idLogCatalog) {
        this.idLogCatalog = idLogCatalog;
    }
}
