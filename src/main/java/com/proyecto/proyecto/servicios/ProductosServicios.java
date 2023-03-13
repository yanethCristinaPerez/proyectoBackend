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
    public List<Productos> masBuscados(String termino, String genero) {


        try{

            List<Productos> productoList = productoRepositorio.findProductosByDescripcionOrColorOrMarcaAndGenero(termino,genero);


            for (Productos producto : productoList) {
                contadorMasBuscados(producto);
            }

            return productoList;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public Optional<Productos> getById(Long id) throws Exception {
        return productoRepositorio.findById(id);
    }

    @Override
    public void contadorMasBuscados(Productos producto) throws Exception {
        producto.setContadorBusquedas(producto.getContadorBusquedas()+1);
        productoRepositorio.save(producto);
    }

    @Override
    public List<Productos> getMasBuscados() throws Exception {
        return productoRepositorio.findTop4ByOrderByContadorBusquedasDesc();
    }

    @Override
    public List<Productos> getByGenero(String genero) {
        return productoRepositorio.getByGenero(genero);
    }
}
