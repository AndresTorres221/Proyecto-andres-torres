package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.Producto;
import java.util.List;

public interface ProductoService {

    Producto guardar(Producto producto);

    List<Producto> listar();

    Producto buscar(Long id);

    Producto actualizar(Long id, Producto producto);

    void eliminar(Long id);
}