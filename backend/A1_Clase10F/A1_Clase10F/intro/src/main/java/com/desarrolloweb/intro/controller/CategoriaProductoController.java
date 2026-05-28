package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.CategoriaProducto;
import com.desarrolloweb.intro.service.CategoriaProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaProductoController {

    private final CategoriaProductoService service;

    public CategoriaProductoController(CategoriaProductoService service) {
        this.service = service;
    }

    @PostMapping
    public CategoriaProducto guardar(@RequestBody CategoriaProducto categoria) {
        return service.guardar(categoria);
    }

    @GetMapping
    public List<CategoriaProducto> listar() {
        return service.listar();
    }
}