package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.BrandEntity;
import com.proyecto.proyecto.model.DocumentTypeEntity;
import com.proyecto.proyecto.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/brands/")
public class BrandRest {

    @Autowired
    private BrandService brandService;

    @GetMapping
    private ResponseEntity<List<BrandEntity>> getAllBrands(){
        return ResponseEntity.ok(brandService.findAll());
    }

    @PostMapping
    private ResponseEntity<BrandEntity> saveBrands(@RequestBody BrandEntity brandEntity){

        try{

            BrandEntity brands= brandService.save(brandEntity);
            return ResponseEntity.created(new URI("/brands/"+brands.getIdBrand())).body(brands);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
