package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.entidades.Productos;
import com.proyecto.proyecto.servicios.ProductosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/catalogo")
public class ProductosRest {

    @Autowired
    private ProductosServicios productosServicios;


    @GetMapping(value = "/{id}")
    private ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(productosServicios.obtenerProductosPorId(id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping(value = "/buscarPorGenero")
    public ResponseEntity<?> getCatalog(@RequestParam(name = "genero") String genero) {

        //return ResponseEntity.ok(productosServicios.buscarPorGenero(genero));
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosServicios.buscarPorGenero(genero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{ERROR.no se encontro productos}");
        }
    }



    @GetMapping("/{genero}/{termino}")
    public ResponseEntity<?> busquedaProducto(@PathVariable String genero, @PathVariable String termino) {


        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosServicios.buscarPorDescripcionMarcaColor(termino,genero));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");
        }
    }


    @GetMapping
    public ResponseEntity<?> obtenerProductosMasBuscados() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosServicios.obtenerProductosMasBuscados());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> actualizarBusquedaPorId(@PathVariable Long id) {
        try {
            Optional<Productos> productoExistente = productosServicios.obtenerProductosPorId(id);
            return productoExistente.map(producto -> {
                try {

                    productosServicios.actualizarBusqueda(producto);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return ResponseEntity.status(HttpStatus.OK).body(producto);
            }).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentra producto\"}");
        }
    }

}
