package com.proyecto.proyecto.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_color", nullable = false)
    private Long idColor;

    @Column(name = "color")
    private String color;

    public Color() {
    }

    public Color(String color) {
        color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public Long getIdColor() {
        return idColor;
    }

    public void setIdColor(Long idColor) {
        this.idColor = idColor;
    }
}
