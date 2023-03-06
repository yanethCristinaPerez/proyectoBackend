package com.proyecto.proyecto.repositorio;


import com.proyecto.proyecto.entidades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Productos,Long> {

    @Query("SELECT p FROM Productos p WHERE (p.descripcion LIKE %?1% OR p.color.color LIKE %?1% OR p.marca.marca LIKE %?1%) AND p.genero.genero=?2")
    List<Productos> findProductosByDescripcionOrColorOrMarcaAndGenero(String termino, String genero);

    List<Productos> findTop4ByOrderByContadorBusquedasDesc();

    @Query("FROM Productos where genero.genero = :genero")
    List<Productos> getByGenero(String genero);



}
