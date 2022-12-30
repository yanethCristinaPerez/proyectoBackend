package com.proyecto.proyecto.model;


import jakarta.persistence.*;

@Entity
@Table(name= "document")
public class DocumentTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "document_type")
    private String document;

    public DocumentTypeEntity() {
    }

    public DocumentTypeEntity(String document) {

        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
