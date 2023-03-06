package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Productos;

import java.util.List;
import java.util.Optional;

public interface InterfazServiciosProductos {

    List<Productos> buscarPorDescripcionMarcaColor(String termino, String genero);

    Optional<Productos> obtenerProductosPorId(Long id) throws Exception;

    void actualizarBusqueda(Productos producto) throws Exception;

    List<Productos> obtenerProductosMasBuscados() throws Exception;

    List<Productos> buscarPorGenero(String genero);


}
