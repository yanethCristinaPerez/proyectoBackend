package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Productos;
import com.proyecto.proyecto.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosServicios implements InterfazServiciosProductos{

    @Autowired
    private ProductoRepositorio productoRepositorio;


    @Override
    public List<Productos> buscarPorDescripcionMarcaColor(String termino, String genero) {
        return productoRepositorio.findProductosByDescripcionOrColorOrMarcaAndGenero(termino,genero);
    }

    @Override
    public Optional<Productos> obtenerProductosPorId(Long id) throws Exception {
        return productoRepositorio.findById(id);
    }

    @Override
    public void actualizarBusqueda(Productos producto) throws Exception {
        producto.setContadorBusquedas(producto.getContadorBusquedas()+1);
        productoRepositorio.save(producto);
    }

    @Override
    public List<Productos> obtenerProductosMasBuscados() throws Exception {
        return productoRepositorio.findTop4ByOrderByContadorBusquedasDesc();
    }

    @Override
    public List<Productos> buscarPorGenero(String genero) {
        return productoRepositorio.getByGenero(genero);
    }
}
