package com.proyecto.proyecto.repositorio;

import com.proyecto.proyecto.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    Usuario findByCorreoAndContrasena(String correo, String contrasena);

    Boolean existsByCorreo(String correoElectronico);

    Usuario findByCorreo(String correoElectronico);


    Usuario findByidUsuarios(Long id);


}
