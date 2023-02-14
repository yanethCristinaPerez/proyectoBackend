package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.CatalogEntity;

import com.proyecto.proyecto.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
@RequestMapping(value="/catalog")
public class CatalogRest {

    @Autowired
    private CatalogService catalogService;


    @GetMapping
    private ResponseEntity<List<CatalogEntity>> getAllProducts(){
        return ResponseEntity.ok(catalogService.findAll());
    }


    @GetMapping(value = "/buscarProducto")
    public ResponseEntity<?> getCatalog(@RequestParam(name="gender") String gender) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(catalogService.getByGender(gender));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{ERROR.no se encontro productos}");
        }
    }

    @GetMapping(value = "/buscarPorNombre")
    public ResponseEntity<?> getCatalogByName(@RequestParam(name="name") String category) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(catalogService.getByCategory(category));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{ERROR.no se encontro productos}");
        }
    }

}


