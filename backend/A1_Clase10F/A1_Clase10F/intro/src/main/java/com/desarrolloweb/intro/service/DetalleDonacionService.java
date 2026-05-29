package com.desarrolloweb.intro.service;

import java.util.List;

import com.desarrolloweb.intro.model.DetalleDonacion;

public interface DetalleDonacionService {

    DetalleDonacion guardar(DetalleDonacion detalle);

    List<DetalleDonacion> listar();

    DetalleDonacion buscar(Long id);

    void eliminar(Long id);
}