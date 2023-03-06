package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.servicios.CarritoImpleServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/carritos")
public class CarritoRest {

    @Autowired
    private CarritoImpleServicio carritoImpleServicio;


    @PostMapping
    private ResponseEntity<Carrito> saveCarrito(@RequestBody Carrito carrito){

        try{

            Carrito carr= carritoImpleServicio.grabarCarrito(carrito);

            return ResponseEntity.created(new URI("/carritos/"+carr.getIdItems())).body(carr);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


}
