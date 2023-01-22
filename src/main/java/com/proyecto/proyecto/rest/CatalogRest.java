package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.CatalogEntity;
import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.catalog.Catalog;
import java.net.URI;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value="/catalog")
public class CatalogRest {

    @Autowired
    private CatalogService catalogService;

  /*  @GetMapping(value = "/{genero}")
    private ResponseEntity<List<CatalogEntity>> getAllDetails(@PathVariable(name="genero") String gender){
        return ResponseEntity.ok(catalogService.findByGenderContaining(gender));
    }*/


    @GetMapping
    private ResponseEntity<List<CatalogEntity>> getAllProducts(){
        return ResponseEntity.ok(catalogService.findAll());
    }

   /* @GetMapping("/searchBySpringDataJPA")
    public String searchCustomerSpringDataJPA(@RequestParam("genderSpringDataJPA") String gender,Model model) {
        try {
            model.addAttribute("catalogs", catalogService.findByGenderContaining(gender));
            System.out.println("Search by Query Spring Data JPA: " + gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "catalog/catalogs";
    }*/


    @GetMapping(path="/searchBySpringDataJPA",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CatalogEntity>> getCatalog(@RequestParam(name="genderSpringDataJPA")String gender) {
         return ResponseEntity.ok(catalogService.findByGenderContaining(gender));
    }



    /*@GetMapping(path="/searchBySpringDataJPA",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CatalogEntity>> getCatalog(@RequestParam(name="genderSpringDataJPA")String gender) {

         try{
            final List<CatalogEntity>  catalog=catalogService.findByGenderContaining(gender);

            return ResponseEntity.ok(catalog);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }*/


/*
     @GetMapping(path="/searchBySpringDataJPA",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CatalogEntity>> searchCustomerSpringDataJPA(@RequestParam("genderSpringDataJPA") String gender,Model model) {

        try {
            List<CatalogEntity> catalog= (List<CatalogEntity>) model.addAttribute("catalogs", catalogService.findByGenderContaining(gender));
            return ResponseEntity.status(HttpStatus.OK).body(catalog);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
*/
}


