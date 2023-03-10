package com.proyecto.proyecto.repositorio;

import com.proyecto.proyecto.entidades.Factura;
import com.proyecto.proyecto.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacturaRepositorio extends JpaRepository<Factura,Long> {

    List<Factura> findByUsuario (Usuario usuario);
}
