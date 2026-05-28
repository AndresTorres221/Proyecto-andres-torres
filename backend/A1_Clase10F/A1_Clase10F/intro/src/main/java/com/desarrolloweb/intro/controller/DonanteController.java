package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.Donante;
import com.desarrolloweb.intro.service.DonanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donantes")
public class DonanteController {

    private final DonanteService service;

    public DonanteController(DonanteService service) {
        this.service = service;
    }

    @PostMapping
    public Donante guardar(@RequestBody Donante donante) {
        return service.guardar(donante);
    }

    @GetMapping
    public List<Donante> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Donante buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Donante actualizar(@PathVariable Long id, @RequestBody Donante donante) {
        return service.actualizar(id, donante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}