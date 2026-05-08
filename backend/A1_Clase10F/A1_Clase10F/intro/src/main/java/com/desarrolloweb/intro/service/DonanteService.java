package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.Donante;
import java.util.List;

public interface DonanteService {

    Donante guardar(Donante donante);

    List<Donante> listar();

    Donante buscar(Long id);

    Donante actualizar(Long id, Donante donante);

    void eliminar(Long id);
}