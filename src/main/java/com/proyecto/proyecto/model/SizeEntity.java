package com.proyecto.proyecto.model;


import jakarta.persistence.*;

@Entity
@Table(name = "size")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_size", nullable = false)
    private Long idSize;

    @Column(name = "size")
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Long getIdSize() {
        return idSize;
    }

    public void setIdSize(Long idSize) {
        this.idSize = idSize;
    }
}
