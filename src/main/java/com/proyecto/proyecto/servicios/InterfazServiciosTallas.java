package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Tallas;
import com.proyecto.proyecto.entidades.TiposDocumentos;

import java.util.List;

public interface InterfazServiciosTallas {

    List<Tallas> obtenerTallas() throws Exception;
}
