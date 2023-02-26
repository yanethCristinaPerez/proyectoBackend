package com.proyecto.proyecto.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="product_catalog")
public class CatalogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_product_catalog", nullable = false)
    private Long idProductCatalog;


    @ManyToOne
    @JoinColumn(name = "size_id_size")
    private SizeEntity size;


    @ManyToOne
    @JoinColumn(name = "gender_id_gender")
    private GenderEntity gender;


    @ManyToOne
    @JoinColumn(name = "brand_id_brand")
    private BrandEntity brand;


    @ManyToOne
    @JoinColumn(name = "color_id_color")
    private ColorEntity color;




    @ManyToOne
    @JoinColumn(name = "category_id_category")
    private CategoryEntity category;

    @Column(name="name")
    private String name;

    @Column(name="available", nullable = false)
    private Integer available;

    @Column(name="image")
    private String image;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private BigDecimal price;

    public CatalogEntity() {
    }

    public CatalogEntity(Long idProductCatalog, String name) {
        this.idProductCatalog = idProductCatalog;
        this.name = name;
    }

    public CatalogEntity(SizeEntity size, GenderEntity gender, BrandEntity brand, ColorEntity color, CategoryEntity category, String name, Integer available, String image, String description, BigDecimal price) {
        this.size = size;
        this.gender = gender;
        this.brand = brand;
        this.color = color;
        this.category = category;
        this.name = name;
        this.available = available;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    public SizeEntity getSize() {
        return size;
    }

    public void setSize(SizeEntity size) {
        this.size = size;
    }

    public GenderEntity getGender() {
        return gender;
    }

    public void setGender(GenderEntity gender) {
        this.gender = gender;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }

    public ColorEntity getColor() {
        return color;
    }

    public void setColor(ColorEntity color) {
        this.color = color;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Long getIdProductCatalog() {
        return idProductCatalog;
    }

    public void setIdProductCatalog(Long idProductCatalog) {
        this.idProductCatalog = idProductCatalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
