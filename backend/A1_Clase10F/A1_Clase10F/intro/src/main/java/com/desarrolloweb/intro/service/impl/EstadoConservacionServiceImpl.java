package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.EstadoConservacion;
import com.desarrolloweb.intro.repository.EstadoConservacionRepository;
import com.desarrolloweb.intro.service.EstadoConservacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoConservacionServiceImpl implements EstadoConservacionService {

    private final EstadoConservacionRepository repo;

    public EstadoConservacionServiceImpl(EstadoConservacionRepository repo) {
        this.repo = repo;
    }

    @Override
    public EstadoConservacion guardar(EstadoConservacion estado) {
        return repo.save(estado);
    }

    @Override
    public List<EstadoConservacion> listar() {
        return repo.findAll();
    }
}