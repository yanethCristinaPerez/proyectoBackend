package com.proyecto.proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private Long idUser;


    @ManyToOne
    @JoinColumn(name = "document_type_id")
    private DocumentTypeEntity documentType;

    @Column(name="documentNumber")
    private Long documentNumber;

    @Column(name="name")
    private String name;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    //@Column(name="termsConditions")
    //private Boolean termsConditions;


    public UserEntity() {
    }

    public UserEntity(DocumentTypeEntity documentType, Long documentNumber, String name, String lastName, String email, String password) {

        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        //this.termsConditions = termsConditions;
    }

    public DocumentTypeEntity getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeEntity documentType) {
        this.documentType = documentType;
    }

    public Long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public Boolean getTermsConditions() {
        return termsConditions;
    }

   // public void setTermsConditions(Boolean termsConditions) {
        this.termsConditions = termsConditions;
    }*/

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
