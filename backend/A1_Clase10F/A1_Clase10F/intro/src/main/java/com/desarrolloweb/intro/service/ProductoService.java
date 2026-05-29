package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.Producto;

import jakarta.transaction.Transactional;

import java.util.List;

public interface ProductoService {

    Producto guardar(Producto producto);

    List<Producto> listar();

    Producto buscar(Long id);

    Producto actualizar(Long id, Producto producto);

    @Transactional
    void eliminar(Long id);
}