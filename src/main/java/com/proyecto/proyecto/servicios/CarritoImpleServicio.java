package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.repositorio.CarritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoImpleServicio implements InterfazServicioCarrito{

    @Autowired
    private CarritoRepositorio carritoRepositorio;


    @Override
    public Carrito grabarCarrito(Carrito carrito) throws Exception {
        return carritoRepositorio.save(carrito);
    }

    @Override
    public void borrarCarritoByIdItem(Carrito carrito) throws Exception {
         carritoRepositorio.delete(carrito);
    }

    @Override
    public List<Carrito> obtenerCarritosByUsuario(Usuario usuario) throws Exception {
        return carritoRepositorio.findCarritoByUsuario(usuario);
    }
}
