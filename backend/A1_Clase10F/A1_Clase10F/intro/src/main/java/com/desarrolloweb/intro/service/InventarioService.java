package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.Inventario;
import java.util.List;

public interface InventarioService {

    Inventario guardar(Inventario inventario);

    List<Inventario> listar();

    Inventario buscar(Long id);

    void eliminar(Long id);
    void actualizarStock(Long productoId, Integer cantidad);
}