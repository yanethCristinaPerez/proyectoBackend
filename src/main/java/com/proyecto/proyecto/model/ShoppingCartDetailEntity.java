package com.proyecto.proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name="shopping_cart_detail")
public class ShoppingCartDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_shopping_cart", nullable = false)
    private Long idShoppingCart;

    @ManyToOne
    @JoinColumn(name = "user_id_user")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "catalog_id_product_catalog")
    private CatalogEntity catalog;

    @Column(name="quantity")
    private Long quantity;



    public CatalogEntity getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogEntity catalog) {
        this.catalog = catalog;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Long getIdShoppingCart() {
        return idShoppingCart;
    }

    public void setIdShoppingCart(Long idShoppingCart) {
        this.idShoppingCart = idShoppingCart;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
