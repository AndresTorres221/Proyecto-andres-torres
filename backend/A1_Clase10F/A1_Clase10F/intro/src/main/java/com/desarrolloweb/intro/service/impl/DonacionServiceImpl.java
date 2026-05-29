package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.dto.DonacionDTO;
import com.desarrolloweb.intro.mapper.DonacionMapper;
import com.desarrolloweb.intro.model.DetalleDonacion;
import com.desarrolloweb.intro.model.Donacion;
import com.desarrolloweb.intro.model.Producto;
import com.desarrolloweb.intro.repository.DonacionRepository;
import com.desarrolloweb.intro.service.DonacionService;
import com.desarrolloweb.intro.service.InventarioService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonacionServiceImpl implements DonacionService {

    private final DonacionRepository repo;
    private final InventarioService inventarioService;

    public DonacionServiceImpl(DonacionRepository repo,
                               InventarioService inventarioService) {
        this.repo = repo;
        this.inventarioService = inventarioService;
    }

    @Override
    public Donacion guardar(Donacion donacion) {

        if (donacion.getDetalles() != null) {
            for (DetalleDonacion d : donacion.getDetalles()) {

                d.setDonacion(donacion);

                Producto p = new Producto();
                p.setId(d.getProducto().getId());
                d.setProducto(p);

                inventarioService.actualizarStock(
                        p.getId(),
                        d.getCantidad()
                );
            }
        }

        return repo.save(donacion);
    }

    @Override
    public List<Donacion> listar() {
        return repo.findAll();
    }

    @Override
    public Donacion buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
