package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.CatalogEntity;
import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.catalog.Catalog;
import java.net.URI;
import java.util.List;
import java.util.Map;


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


}


