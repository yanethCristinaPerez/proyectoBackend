package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/users/")
public class UserRest {

    @Autowired
    private UserService userService;


    @GetMapping
    private ResponseEntity<List<UserEntity>> getAllUsers(){
            return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    private ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity){

        try{

            UserEntity user= userService.save(userEntity);
            return ResponseEntity.created(new URI("/users/"+user.getIdUser())).body(user);
        }catch (Exception e){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
