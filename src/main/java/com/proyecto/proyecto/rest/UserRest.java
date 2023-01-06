package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.service.UserByEmPass;
import com.proyecto.proyecto.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import java.net.URI;
import java.util.List;
import java.util.Map;

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

    @PostMapping(value = "login", consumes = "application/json", produces = "application/json")
    private ResponseEntity<UserEntity> login(@RequestBody Map<String, Object> userl){
        try{
            System.out.println("ESTAMOS EN EL METODO REQUESTMAPPING LOGIN"+userl);
            String email=(String) userl.get("email");

            String password=(String) userl.get("password");
            System.out.println("este es el email " +email+" y el password "+password);
            UserEntity user=userService.findUserByEP(email,password);

            return ResponseEntity.ok(user);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }


    }



}
