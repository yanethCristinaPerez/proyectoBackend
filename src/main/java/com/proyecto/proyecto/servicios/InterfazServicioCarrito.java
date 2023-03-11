package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Usuario;

import java.util.List;

public interface InterfazServicioCarrito {

    Carrito grabarCarrito(Carrito carrito) throws Exception;

    void borrarCarritoByIdItem(Long id) throws Exception;

    List<Carrito> obtenerCarritosByUsuario(Long id) throws Exception;


}
