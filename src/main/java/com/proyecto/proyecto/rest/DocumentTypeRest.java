package com.proyecto.proyecto.rest;

import com.proyecto.proyecto.model.DocumentTypeEntity;
import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.service.DocumentTypeService;
import com.proyecto.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/documents/")
public class DocumentTypeRest {

    @Autowired
    private DocumentTypeService documentTypeService;


    @GetMapping
    private ResponseEntity<List<DocumentTypeEntity>> getAllDocTypes(){
        return ResponseEntity.ok(documentTypeService.findAll());
    }

    @PostMapping
    private ResponseEntity<DocumentTypeEntity> saveDocuments(@RequestBody DocumentTypeEntity documentTypeEntity){

        try{

            DocumentTypeEntity documents= documentTypeService.save(documentTypeEntity);
            return ResponseEntity.created(new URI("/documents/"+documents.getId())).body(documents);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
