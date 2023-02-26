package com.proyecto.proyecto.rest;


import com.proyecto.proyecto.model.LogCatalog;
import com.proyecto.proyecto.service.LogCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/log")
public class LogCatalogRest {

    @Autowired
    private LogCatalogService logCatalogService;



    @GetMapping(value = "/mostrarLogCatalog")
    public ResponseEntity<List<String>> mostrarLogCatalog() {

        return ResponseEntity.ok(logCatalogService.mostrarLog());

    }
}
