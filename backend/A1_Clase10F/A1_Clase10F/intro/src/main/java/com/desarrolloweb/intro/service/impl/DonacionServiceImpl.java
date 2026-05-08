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

    public DonacionServiceImpl(DonacionRepository repo, InventarioService inventarioService) {
        this.repo = repo;
        this.inventarioService = inventarioService;
    }

    // CU-01 | RF-01 | E01 - registrarDonacion()
    @Override
    public Donacion guardar(Donacion donacion) {

        if (donacion.getDetalles() != null) {
            for (DetalleDonacion d : donacion.getDetalles()) {

                // CU-01 | RF-01 | E02 - asociarDetalleDonacion()
                d.setDonacion(donacion);

                
                Producto p = new Producto();
                p.setId(d.getProducto().getId());
                d.setProducto(p);

                // CU-02 | RF-03 | E05 - actualizarInventario()
                inventarioService.actualizarStock(
                        p.getId(),
                        d.getCantidad()
                );
            }
        }

        return repo.save(donacion);
    }

    // CU-01 | RF-04 | E03 - listarDonaciones()
    @Override
   public List<DonacionDTO> listar() {
    return DonacionMapper.toDTOList(repo.findAll());
}

    // CU-01 | RF-05 | E04 - buscarDonacionPorId()
    @Override
   public DonacionDTO buscar(Long id) {
    Donacion donacion = repo.findById(id).orElse(null);
    return DonacionMapper.toDTO(donacion);
}

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}