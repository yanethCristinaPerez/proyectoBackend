package com.proyecto.proyecto.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import jakarta.validation.constraints.Email;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_usuarios", nullable = false)
    private Long idUsuarios;


    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TiposDocumentos tiposDocumentos;

    @Column(nullable = false)
    @Pattern(regexp = "^[0-9]*$", message = "documento solo puede tener numeros")
    private String numeroDocumento;

    @Column(nullable = false)
    @Pattern(regexp = "[a-zA-Z\s]+",message = "nombre solo se permiten letras y espacios")
    private String nombres;


    @Column(nullable = false)
    @Pattern(regexp = "[a-zA-Z\s]+",message = "apellido solo se permiten letras y espacios")
    private String apellidos;

    @Column(nullable = false)
    @Email(message = "por favor ingrese un correo electronico valido")
    private String correo;

    @Column(nullable = false)
    @Pattern(regexp = "(?=^.{5,}$)((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))^.*", message = "contraseña debe ser de longitud mínima 5, y debe contener letras mayúsculas,\n" +
            "letras minúsculas y números.\n")
    private String contrasena;


    public Usuario() {
    }

    public Usuario(TiposDocumentos tiposDocumentos, String numeroDocumento, String nombres, String apellidos, String correo, String contrasena) {
        this.tiposDocumentos = tiposDocumentos;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Long getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Long idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public TiposDocumentos getTiposDocumentos() {
        return tiposDocumentos;
    }

    public void setTiposDocumentos(TiposDocumentos tiposDocumentos) {
        this.tiposDocumentos = tiposDocumentos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
