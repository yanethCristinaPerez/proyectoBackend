package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Productos;

import java.util.List;
import java.util.Optional;

public interface InterfazServiciosProductos {

    List<Productos> masBuscados(String termino, String genero);

    Optional<Productos> getById(Long id) throws Exception;

    void contadorMasBuscados(Productos producto) throws Exception;
    List<Productos> getMasBuscados() throws Exception;

    List<Productos> getByGenero(String genero);

    boolean descontarCantidad(Long idProducto, int cantidadPedida);

    String isDisponible(Long idProducto, int cantidadPedida);


}
