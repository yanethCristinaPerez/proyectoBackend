package com.proyecto.proyecto.restControler;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.servicios.UsuarioImpleServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UsuarioRest {


    @Autowired
    private UsuarioImpleServicio usuarioImpleServicio;


    @GetMapping
    private ResponseEntity<List<Usuario>> getAllUsers(){
            try {
            return ResponseEntity.ok(usuarioImpleServicio.obtenerUsuario());
            }catch (Exception e){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
    }

    @PostMapping
    private ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario){

        try{

            Usuario user= usuarioImpleServicio.grabarUsuario(usuario);
            return ResponseEntity.created(new URI("/users/"+user.getIdUsuarios())).body(user);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    /*@PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        try {
            Boolean isLogin = usuarioImpleServicio.loginUsuario(usuario.getCorreo(), usuario.getContrasena());
            if (isLogin) {
                System.out.println("login success");
                System.out.println("correo"+usuario.getCorreo());
                String correo = usuario.getCorreo();
                Map<String, String> respuesta = new HashMap<>();
                respuesta.put("correo_electronico", correo);
                ObjectMapper objectMapper = new ObjectMapper();
                String json = objectMapper.writeValueAsString(respuesta);
                return ResponseEntity.status(HttpStatus.OK).body(json);
            } else {
                System.out.println("usuario no existe");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"status\":\"correo o contraseña incorrectos\"}");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\":\"Error en la respuesta\"}" + e.getMessage());
        }
    }*/

    @PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
    private ResponseEntity<?> login(@RequestBody Map<String, Object> userl){
        try{
            System.out.println("ESTAMOS EN EL METODO REQUESTMAPPING LOGIN"+userl);
            String correo=(String) userl.get("correo");

            String password=(String) userl.get("contrasena");
            System.out.println("este es el email " +correo+" y el password "+password);
            Usuario user= usuarioImpleServicio.obternerUsuarioPorCorreoContrasena(correo,password);

            Map<String, String> respuesta = new HashMap<>();
            respuesta.put("correo", correo);
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(respuesta);



            return ResponseEntity.status(HttpStatus.OK).body(json);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }


    }

    @GetMapping("/{correo}")
    public ResponseEntity<Usuario> obternerUsuarioPorCorreo(@PathVariable String correo, Usuario usuario) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioImpleServicio.obternerUsuarioPorCorreo(correo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
