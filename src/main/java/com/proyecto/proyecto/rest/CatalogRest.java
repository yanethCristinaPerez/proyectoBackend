package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.CatalogEntity;

import com.proyecto.proyecto.model.LogCatalog;
import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value="/catalog")
public class CatalogRest {

    @Autowired
    private CatalogService catalogService;


    @GetMapping(value = "/buscarTodos")
    private ResponseEntity<List<CatalogEntity>> getAllProducts() {
        return ResponseEntity.ok(catalogService.findAll());
    }

    @GetMapping(value = "/buscarPorId")
    private ResponseEntity<CatalogEntity> getById(@PathVariable Long id) {
        return ResponseEntity.ok(catalogService.getById(id));
    }

    @GetMapping(value = "/buscarProducto")
    public ResponseEntity<?> getCatalog(@RequestParam(name = "gender") String gender) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(catalogService.getByGender(gender));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{ERROR.no se encontro productos}");
        }
    }

    @GetMapping(value = "/buscarPorNombre")
    public ResponseEntity<?> getCatalogByName(@RequestParam(name = "name") String category) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(catalogService.getByCategory(category));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{ERROR.no se encontro productos}");
        }
    }

    @GetMapping("/{descrip}/{genero}")
    public ResponseEntity<?> busquedaProducto(@PathVariable String descrip, @PathVariable String genero) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(catalogService.findCatalogEntityByDescriptionEqualsIgnoreCaseOrColorEqualsIgnoreCaseOrBrandEqualsIgnoreCaseAndGender(descrip, genero));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");
        }
    }

    @PostMapping(value = "guardarCatalogo", consumes = "application/json", produces = "application/json")
    private ResponseEntity<?> guardarLog(@RequestBody Map<String, Object> userl) {
        try {
            System.out.println("ESTAMOS EN EL METODO REQUESTMAPPING LOGIN" + userl);
            int id = (Integer) userl.get("id");

            String nombre = (String) userl.get("nombre");

            catalogService.guardarLog(id,nombre);


            return ResponseEntity.status(HttpStatus.OK).body("{\"status\":\"success\"}");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


}

