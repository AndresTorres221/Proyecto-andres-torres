package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.Producto;
import com.desarrolloweb.intro.repository.ProductoRepository;
import com.desarrolloweb.intro.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repo;

    public ProductoServiceImpl(ProductoRepository repo) {
        this.repo = repo;
    }

    @Override
    public Producto guardar(Producto producto) {
        return repo.save(producto);
    }

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public Producto buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Producto actualizar(Long id, Producto producto) {
        producto.setId(id);
        return repo.save(producto);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}