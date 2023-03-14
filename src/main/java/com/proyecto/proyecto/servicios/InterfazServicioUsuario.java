package com.proyecto.proyecto.servicios;


import com.proyecto.proyecto.entidades.Usuario;

import java.util.List;

public interface InterfazServicioUsuario {

    Usuario grabarUsuario(Usuario usuario) throws Exception;

    Boolean loginUsuario(String correoelectronico, String contrasena) throws Exception;

    List<Usuario> obtenerUsuario() throws Exception;

    Usuario getPorCorreo(String correo) throws Exception;

    Usuario getPorCorreoContrasena(String correo, String contrasena) throws Exception;

    Usuario obtenerUsuarioByIdUsuario(Long id);
}
