package com.proyecto.proyecto.restControler;

import com.proyecto.proyecto.entidades.Tallas;
import com.proyecto.proyecto.entidades.TiposDocumentos;
import com.proyecto.proyecto.servicios.TallasImpleServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tallas")
public class TallasRest {

    @Autowired
    private TallasImpleServicio tallasImpleServicio;

    @GetMapping
    private ResponseEntity<List<Tallas>> getAllDocTypes(){
        try {
            return ResponseEntity.ok(tallasImpleServicio.obtenerTallas());

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}
