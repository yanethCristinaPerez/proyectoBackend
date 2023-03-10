package com.proyecto.proyecto.entidades;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura", nullable = false)
    private Long idFactura;

    private LocalDate fecha;

    private String direccion;

    private String correo;

    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuarios")
    private Usuario usuario;


    @OneToMany
    private List<Carrito> detalles;

    public Factura() {
    }

    public Factura(LocalDate fecha, String direccion, String correo, String ciudad, Usuario usuario, List<Carrito> detalles) {
        this.fecha = fecha;
        this.direccion = direccion;
        this.correo = correo;
        this.ciudad = ciudad;
        this.usuario = usuario;
        this.detalles = detalles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Carrito> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Carrito> detalles) {
        this.detalles = detalles;
    }
}
