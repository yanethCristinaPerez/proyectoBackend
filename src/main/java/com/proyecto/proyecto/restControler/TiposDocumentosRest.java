package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.entidades.TiposDocumentos;
import com.proyecto.proyecto.servicios.TiposDocumentosImpleServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documents/")
public class TiposDocumentosRest {

    @Autowired
    private TiposDocumentosImpleServicio tiposDocumentosImpleServicio;

        @GetMapping
        private ResponseEntity<List<TiposDocumentos>> getAllDocTypes(){
            try {
                return ResponseEntity.ok(tiposDocumentosImpleServicio.obtenerTiposDocumento());

            }catch (Exception e){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
                }
        }
}
