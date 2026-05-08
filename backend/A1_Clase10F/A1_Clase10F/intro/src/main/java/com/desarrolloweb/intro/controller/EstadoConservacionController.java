package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.EstadoConservacion;
import com.desarrolloweb.intro.service.EstadoConservacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estados")
public class EstadoConservacionController {

    private final EstadoConservacionService service;

    public EstadoConservacionController(EstadoConservacionService service) {
        this.service = service;
    }

    @PostMapping
    public EstadoConservacion guardar(@RequestBody EstadoConservacion estado) {
        return service.guardar(estado);
    }

    @GetMapping
    public List<EstadoConservacion> listar() {
        return service.listar();
    }
}