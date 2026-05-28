package com.desarrolloweb.intro.service.impl;

import com.desarrolloweb.intro.model.Donante;
import com.desarrolloweb.intro.repository.DonanteRepository;
import com.desarrolloweb.intro.service.DonanteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonanteServiceImpl implements DonanteService {

    private final DonanteRepository repo;

    public DonanteServiceImpl(DonanteRepository repo) {
        this.repo = repo;
    }

    @Override
    public Donante guardar(Donante donante) {
        return repo.save(donante);
    }

    @Override
    public List<Donante> listar() {
        return repo.findAll();
    }

    @Override
    public Donante buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Donante actualizar(Long id, Donante donante) {
        Donante existente = repo.findById(id).orElse(null);

        if (existente != null) {
            existente.setNombre(donante.getNombre());
            existente.setTelefono(donante.getTelefono());
            existente.setDireccion(donante.getDireccion());
            existente.setUsuario(donante.getUsuario());

            return repo.save(existente);
        }

        return null;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}