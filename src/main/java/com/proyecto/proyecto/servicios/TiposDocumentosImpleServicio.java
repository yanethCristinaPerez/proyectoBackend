package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.TiposDocumentos;
import com.proyecto.proyecto.repositorio.TiposDocumentosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TiposDocumentosImpleServicio implements InterfazServicioTiposDocumentos {

    @Autowired
    private TiposDocumentosRepositorio tiposDocumentosRepositorio;


    @Override
    public List<TiposDocumentos> obtenerTiposDocumento() throws Exception {
        try {
            return tiposDocumentosRepositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
