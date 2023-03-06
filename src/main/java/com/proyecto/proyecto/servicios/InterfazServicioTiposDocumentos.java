package com.proyecto.proyecto.servicios;


import com.proyecto.proyecto.entidades.TiposDocumentos;

import java.util.List;

public interface InterfazServicioTiposDocumentos {

    List<TiposDocumentos> obtenerTiposDocumento() throws Exception;
}
