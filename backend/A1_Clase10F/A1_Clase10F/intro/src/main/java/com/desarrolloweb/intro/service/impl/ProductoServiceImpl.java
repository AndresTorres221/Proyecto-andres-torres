package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.Producto;
import com.desarrolloweb.intro.repository.ProductoRepository;
import com.desarrolloweb.intro.repository.DetalleDonacionRepository;
import com.desarrolloweb.intro.repository.InventarioRepository;
import com.desarrolloweb.intro.service.ProductoService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repo;
    private final DetalleDonacionRepository detalleRepo;
    private final InventarioRepository inventarioRepo;

    public ProductoServiceImpl(ProductoRepository repo,
                               DetalleDonacionRepository detalleRepo,
                               InventarioRepository inventarioRepo) {
        this.repo = repo;
        this.detalleRepo = detalleRepo;
        this.inventarioRepo = inventarioRepo;
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
    @Transactional
    public void eliminar(Long id) {

        // 1. eliminar dependencias primero
        detalleRepo.eliminarPorProducto(id);
        inventarioRepo.deleteByProductoId(id);

        // 2. luego eliminar producto
        repo.deleteById(id);
    }
}