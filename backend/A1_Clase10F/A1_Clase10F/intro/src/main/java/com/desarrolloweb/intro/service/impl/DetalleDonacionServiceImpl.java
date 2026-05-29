package com.desarrolloweb.intro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrolloweb.intro.model.DetalleDonacion;
import com.desarrolloweb.intro.repository.DetalleDonacionRepository;
import com.desarrolloweb.intro.service.DetalleDonacionService;

@Service
public class DetalleDonacionServiceImpl implements DetalleDonacionService {

    @Autowired
    private DetalleDonacionRepository repo;

    @Override
    public DetalleDonacion guardar(DetalleDonacion detalle) {
        return repo.save(detalle);
    }

    @Override
    public List<DetalleDonacion> listar() {
        return repo.findAll();
    }

    @Override
public DetalleDonacion buscar(Long id) {
    return repo.findById(id).orElse(null);
}

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}