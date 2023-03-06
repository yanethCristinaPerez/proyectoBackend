package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Tallas;
import com.proyecto.proyecto.repositorio.TallasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TallasImpleServicio implements InterfazServiciosTallas{
    @Autowired
    private TallasRepositorio tallasRepositorio;


    @Override
    public List<Tallas> obtenerTallas() throws Exception {
        return tallasRepositorio.findAll();
    }
}
