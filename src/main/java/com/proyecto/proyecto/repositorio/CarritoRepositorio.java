package com.proyecto.proyecto.repositorio;

import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Productos;
import com.proyecto.proyecto.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarritoRepositorio extends JpaRepository<Carrito,Long> {

    List<Carrito> findCarritoByUsuario(Usuario usuario);


}
