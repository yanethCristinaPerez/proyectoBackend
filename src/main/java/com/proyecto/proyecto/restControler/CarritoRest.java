package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.TiposDocumentos;
import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.servicios.CarritoImpleServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

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

    @GetMapping (value = "/{id}")
    private ResponseEntity<List<Carrito>> getAllCarritos(@PathVariable Long id){
        System.out.println("esoy en el metodo obtener items");
        try {
            return ResponseEntity.ok(carritoImpleServicio.obtenerCarritosByUsuario(id));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Carrito> eliminarItemPorId(@PathVariable Long id){
        try {
            carritoImpleServicio.borrarCarritoByIdItem(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
