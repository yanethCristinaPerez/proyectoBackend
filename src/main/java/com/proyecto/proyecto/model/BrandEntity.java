package com.proyecto.proyecto.model;


import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_brand", nullable = false)
    private Long idBrand;

    @Column(name = "brand")
    private String brand;

    public BrandEntity() {
    }

    public BrandEntity(String brand) {
        this.idBrand = idBrand;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

}
