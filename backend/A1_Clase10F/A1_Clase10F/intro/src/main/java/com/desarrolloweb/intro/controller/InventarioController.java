package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.Inventario;
import com.desarrolloweb.intro.service.InventarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @PostMapping
    public Inventario guardar(@RequestBody Inventario inventario) {
        return service.guardar(inventario);
    }

    @GetMapping
    public List<Inventario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Inventario buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}