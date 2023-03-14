package com.proyecto.proyecto.servicios;


import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpleServicio implements InterfazServicioUsuario{

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;


    @Override
    public Usuario grabarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuarioRepositorio.existsByCorreo(usuario.getCorreo())) {
                throw new IllegalArgumentException("correo ya se encuentra registrado");
            }
            return usuarioRepositorio.save(usuario);
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                throw e;
            }
            throw new Exception("Error inesperado tratando de guardar el usuario");
        }
    }

    @Override
    public Boolean loginUsuario(String correoelectronico, String contrasena) throws Exception {
        try {
            Usuario usuario = usuarioRepositorio.findByCorreoAndContrasena(correoelectronico, contrasena);
            return usuario != null;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Usuario> obtenerUsuario() throws Exception {
        try {
            return usuarioRepositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Usuario getPorCorreo(String correo) throws Exception {
        try {
            return usuarioRepositorio.findByCorreo(correo);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Usuario getPorCorreoContrasena(String correo, String contrasena) throws Exception {
        return usuarioRepositorio.findByCorreoAndContrasena(correo,contrasena);
    }

    @Override
    public Usuario obtenerUsuarioByIdUsuario(Long id) {
        return usuarioRepositorio.findByidUsuarios(id);
    }
}
