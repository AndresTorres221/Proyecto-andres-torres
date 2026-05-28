package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.CategoriaProducto;
import com.desarrolloweb.intro.repository.CategoriaProductoRepository;
import com.desarrolloweb.intro.service.CategoriaProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaProductoServiceImpl implements CategoriaProductoService {

    private final CategoriaProductoRepository repo;

    public CategoriaProductoServiceImpl(CategoriaProductoRepository repo) {
        this.repo = repo;
    }

    @Override
    public CategoriaProducto guardar(CategoriaProducto categoria) {
        return repo.save(categoria);
    }

    @Override
    public List<CategoriaProducto> listar() {
        return repo.findAll();
    }
}