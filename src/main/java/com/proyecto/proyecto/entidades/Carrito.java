package com.proyecto.proyecto.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_items", nullable = false)
    private Long idItems;


    private int cantidadPedida;
    @ManyToOne
    @JoinColumn(name = "talla_pedida_id_tallas")
    private Tallas tallaPedida;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuarios")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "productos_id_productos")
    private Productos productos;



    public Carrito() {
    }

    public Carrito(int cantidadPedida, Tallas tallaPedida, Usuario usuario, Productos productos) {
        this.cantidadPedida = cantidadPedida;
        this.tallaPedida = tallaPedida;
        this.usuario = usuario;
        this.productos = productos;
    }


    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Long getIdItems() {
        return idItems;
    }

    public void setIdItems(Long idItems) {
        this.idItems = idItems;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public Tallas getTallaPedida() {
        return tallaPedida;
    }

    public void setTallaPedida(Tallas tallaPedida) {
        this.tallaPedida = tallaPedida;
    }
}
