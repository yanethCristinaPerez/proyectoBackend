package com.proyecto.proyecto.rest;


import com.proyecto.proyecto.model.ShoppingCartDetailEntity;

import com.proyecto.proyecto.service.ShoppingCartDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(value="/shoppingCarts")
public class ShoppingCartDetailRest {

    @Autowired
    private ShoppingCartDetailService shoppingCartDetailService;

    @PostMapping
    private ResponseEntity<ShoppingCartDetailEntity> saveUser(@RequestBody ShoppingCartDetailEntity shoppingCartDetailEntity){

        try{

            ShoppingCartDetailEntity cart= shoppingCartDetailService.save(shoppingCartDetailEntity);
            return ResponseEntity.created(new URI("/shoppingCarts/"+cart.getIdShoppingCart())).body(cart);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
