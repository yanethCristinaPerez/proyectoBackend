package com.proyecto.proyecto.servicios;

import com.proyecto.proyecto.entidades.Factura;
import com.proyecto.proyecto.entidades.Usuario;

import java.util.List;
import java.util.Optional;

public interface InterfazServiciosFactura {

    Factura guardarFactura(Factura factura) throws Exception;

}
