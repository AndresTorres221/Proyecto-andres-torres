package com.desarrolloweb.intro.controller;


import com.desarrolloweb.intro.model.Donacion;
import com.desarrolloweb.intro.service.DonacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donaciones")
public class DonacionController {

    private final DonacionService service;

    public DonacionController(DonacionService service) {
        this.service = service;
    }

    @PostMapping
    public Donacion guardar(@RequestBody Donacion donacion) {
        return service.guardar(donacion);
    }

    @GetMapping
    public List<Donacion> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Donacion buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
