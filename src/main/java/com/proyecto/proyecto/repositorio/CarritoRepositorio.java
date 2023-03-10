package com.proyecto.proyecto.repositorio;

import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Productos;
import com.proyecto.proyecto.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarritoRepositorio extends JpaRepository<Carrito,Long> {

    @Query("FROM Carrito WHERE usuario.idUsuarios=:idUsuarios")
    List<Carrito> findCarritoByUsuario(Long idUsuarios);


}
