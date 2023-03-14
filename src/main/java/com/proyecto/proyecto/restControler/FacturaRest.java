package com.proyecto.proyecto.restControler;



import com.proyecto.proyecto.entidades.Factura;

import com.proyecto.proyecto.servicios.FacturaImpleServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;

@RestController
@RequestMapping("/factura")
public class FacturaRest {

    @Autowired
    private FacturaImpleServicio facturaImpleServicio;


    @PostMapping
    private ResponseEntity<Factura> saveFactura(@RequestBody Factura factura){

        LocalDate fechaCreacion =LocalDate.now();

        factura.setFecha(fechaCreacion);

        try{

            Factura factura1= facturaImpleServicio.guardarFactura(factura);

            return ResponseEntity.created(new URI("/factura/"+factura1.getIdFactura())).body(factura1);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }



}
