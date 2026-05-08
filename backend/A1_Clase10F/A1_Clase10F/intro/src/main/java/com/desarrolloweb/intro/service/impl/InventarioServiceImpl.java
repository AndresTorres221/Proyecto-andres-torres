package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.Inventario;
import com.desarrolloweb.intro.model.Producto;
import com.desarrolloweb.intro.repository.InventarioRepository;
import com.desarrolloweb.intro.service.InventarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService {

    private final InventarioRepository repo;

    public InventarioServiceImpl(InventarioRepository repo) {
        this.repo = repo;
    }

    @Override
    public Inventario guardar(Inventario inventario) {
        return repo.save(inventario);
    }


     // CU-02 | RF-04 | E06 - listarInventario()
    @Override
    public List<Inventario> listar() {
        return repo.findAll();
    }

    @Override
    public Inventario buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    

    // CU-02 | RF-03 | E05 - actualizarInventario()

    @Override
public void actualizarStock(Long productoId, Integer cantidad) {

    Inventario inventario = repo.findAll()
        .stream()
        .filter(i -> i.getProducto().getId().equals(productoId))
        .findFirst()
        .orElse(null);

    if (inventario != null) {
        inventario.setCantidad(inventario.getCantidad() + cantidad);
    } else {
        Inventario nuevo = new Inventario();
        Producto p = new Producto();
        p.setId(productoId);

        nuevo.setProducto(p);
        nuevo.setCantidad(cantidad);

        repo.save(nuevo);
        return;
    }

    repo.save(inventario);
}
}