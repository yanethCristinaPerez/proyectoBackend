package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Factura;
import com.proyecto.proyecto.entidades.Usuario;
import com.proyecto.proyecto.repositorio.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaImpleServicio implements InterfazServiciosFactura{

    @Autowired
    private FacturaRepositorio facturaRepositorio;


    @Override
    public Factura guardarFactura(Factura factura) throws Exception {
        return facturaRepositorio.save(factura);


    }

}
