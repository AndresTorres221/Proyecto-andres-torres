package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.CategoriaProducto;
import java.util.List;

public interface CategoriaProductoService {

    CategoriaProducto guardar(CategoriaProducto categoria);

    List<CategoriaProducto> listar();
}