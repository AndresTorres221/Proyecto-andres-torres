package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.Rol;
import com.desarrolloweb.intro.repository.RolRepository;
import com.desarrolloweb.intro.service.RolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository repo;

    public RolServiceImpl(RolRepository repo) {
        this.repo = repo;
    }

    @Override
    public Rol guardar(Rol rol) {
        return repo.save(rol);
    }

    @Override
    public List<Rol> listar() {
        return repo.findAll();
    }

    @Override
    public Rol buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Rol actualizar(Long id, Rol rol) {
        rol.setId(id);
        return repo.save(rol);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}