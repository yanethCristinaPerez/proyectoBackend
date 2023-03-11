package com.proyecto.proyecto.restControler;


import com.proyecto.proyecto.entidades.Carrito;
import com.proyecto.proyecto.entidades.Factura;
import com.proyecto.proyecto.entidades.Productos;
import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.servicios.CarritoImpleServicio;
import com.proyecto.proyecto.servicios.FacturaImpleServicio;
import com.proyecto.proyecto.servicios.UsuarioImpleServicio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaRest {

    @Autowired
    private FacturaImpleServicio facturaImpleServicio;

    @Autowired
    private UsuarioImpleServicio usuarioImpleServicio;

    @Autowired
    private CarritoImpleServicio carritoImpleServicio;


    List<Carrito> detalles = new ArrayList<Carrito>();

    Factura factura=new Factura();



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

    /*@GetMapping("/saveFactura")
    public String saveFactura(HttpSession session ) throws Exception {
        LocalDate fechaCreacion =LocalDate.now();

        factura.setFecha(fechaCreacion);


        //usuario
        Usuario usuario = usuarioImpleServicio.obtenerUsuarioByIdUsuario( Long.parseLong(session.getAttribute("idUsuarios").toString()));

        factura.setUsuario(usuario);
        facturaImpleServicio.guardarFactura(factura);

        //guardar detalles
        for (Carrito dt:detalles) {
            dt.getIdItems();
            carritoImpleServicio.grabarCarrito(dt);
        }


        return "redirect:/";
    }
*/

}
