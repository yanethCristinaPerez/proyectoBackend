package com.proyecto.proyecto.repositorio;

import com.proyecto.proyecto.entidades.Tallas;
import com.proyecto.proyecto.entidades.TiposDocumentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TallasRepositorio extends JpaRepository<Tallas, Long> {
}
