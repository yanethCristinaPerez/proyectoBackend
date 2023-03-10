package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Factura;
import com.proyecto.proyecto.servicios.FacturaImpleServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.URI;

@RestController
@RequestMapping("/factura")
public class FacturaRest {

    @Autowired
    private FacturaImpleServicio facturaImpleServicio;

    @PostMapping
    private ResponseEntity<Factura> saveFactura(@RequestBody Factura factura){

        try{

            Factura factura1= facturaImpleServicio.guardarFactura(factura);

            return ResponseEntity.created(new URI("/factura/"+factura1.getIdFactura())).body(factura1);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


}
