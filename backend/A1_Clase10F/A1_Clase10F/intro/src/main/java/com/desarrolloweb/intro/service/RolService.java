package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.Rol;
import java.util.List;

public interface RolService {

    Rol guardar(Rol rol);

    List<Rol> listar();

    Rol buscar(Long id);

    Rol actualizar(Long id, Rol rol);

    void eliminar(Long id);
}