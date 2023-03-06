package com.proyecto.proyecto.entidades;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productos", nullable = false)
    private Long idProductos;

    private String nombre;
    private String imagen;
    private Integer cantidadDisponible;
    private String descripcion;
    private double precio;
    private int contadorBusquedas;

    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private  Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Tallas tallas;


    public Productos() {
    }

    public Productos(String nombre, String imagen, Integer cantidadDisponible, String descripcion, double precio, int contadorBusquedas, Color color, Genero genero, Marca marca, Tallas tallas) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.cantidadDisponible = cantidadDisponible;
        this.descripcion = descripcion;
        this.precio = precio;
        this.contadorBusquedas = contadorBusquedas;
        this.color = color;
        this.genero = genero;
        this.marca = marca;
        this.tallas = tallas;
    }

    public Long getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Long idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContadorBusquedas() {
        return contadorBusquedas;
    }

    public void setContadorBusquedas(int contadorBusquedas) {
        this.contadorBusquedas = contadorBusquedas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Tallas getTallas() {
        return tallas;
    }

    public void setTallas(Tallas tallas) {
        this.tallas = tallas;
    }
}
