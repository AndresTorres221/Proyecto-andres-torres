package com.desarrolloweb.intro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.intro.model.DetalleDonacion;
import com.desarrolloweb.intro.model.Donacion;
import com.desarrolloweb.intro.model.Producto;
import com.desarrolloweb.intro.repository.DetalleDonacionRepository;
import com.desarrolloweb.intro.repository.DonacionRepository;
import com.desarrolloweb.intro.repository.ProductoRepository;
import com.desarrolloweb.intro.service.DetalleDonacionService;

@Service
public class DetalleDonacionServiceImpl implements DetalleDonacionService {

    @Autowired
    private DetalleDonacionRepository detalleRepository;

    @Autowired
    private DonacionRepository donacionRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Override
public DetalleDonacion guardar(DetalleDonacion detalle) {

    if (detalle.getDonacion() == null || detalle.getDonacion().getId() == null) {
        throw new RuntimeException("Donación no enviada desde el formulario");
    }

    if (detalle.getProducto() == null || detalle.getProducto().getId() == null) {
        throw new RuntimeException("Producto no enviado desde el formulario");
    }

    Donacion donacion = donacionRepository.findById(detalle.getDonacion().getId())
            .orElseThrow(() -> new RuntimeException("Donación no existe"));

    Producto producto = productoRepository.findById(detalle.getProducto().getId())
            .orElseThrow(() -> new RuntimeException("Producto no existe"));

    detalle.setDonacion(donacion);
    detalle.setProducto(producto);

    return detalleRepository.save(detalle);
}

    @Override
    public List<DetalleDonacion> listar() {
        return detalleRepository.findAll();
    }

    @Override
    public DetalleDonacion buscar(Long id) {
        return detalleRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        detalleRepository.deleteById(id);
    }
}
