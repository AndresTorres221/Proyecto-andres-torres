package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.Donacion;
import java.util.List;

public interface DonacionService {

    Donacion guardar(Donacion donacion);

    List<Donacion> listar();

    Donacion buscar(Long id);

    void eliminar(Long id);
}