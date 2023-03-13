package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.servicios.ProductosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/catalogo")
public class ProductosRest {

    @Autowired
    private ProductosServicios productosServicios;


    @GetMapping(value = "/{id}")
    private ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(productosServicios.getById(id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping(value = "/buscarPorGenero")
    public ResponseEntity<?> getCatalog(@RequestParam(name = "genero") String genero) {


        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosServicios.getByGenero(genero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{ERROR.no se encontro productos}");
        }
    }



    @GetMapping("/{genero}/{termino}")
    public ResponseEntity<?> busquedaProducto(@PathVariable String genero, @PathVariable String termino) {


        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosServicios.masBuscados(termino,genero));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");
        }
    }


    @GetMapping
    public ResponseEntity<?> obtenerProductosMasBuscados() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosServicios.getMasBuscados());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");
        }
    }



}
