package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.Producto;
import com.desarrolloweb.intro.service.ProductoService;
import com.desarrolloweb.intro.service.CategoriaProductoService;
import com.desarrolloweb.intro.service.EstadoConservacionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vista/productos")
public class ProductoVistaController {

    private final ProductoService service;
    private final CategoriaProductoService categoriaService;
    private final EstadoConservacionService estadoService;

    public ProductoVistaController(
            ProductoService service,
            CategoriaProductoService categoriaService,
            EstadoConservacionService estadoService
    ) {
        this.service = service;
        this.categoriaService = categoriaService;
        this.estadoService = estadoService;
    }

   
    @GetMapping
    public String listar(Model model) {

        model.addAttribute("productos", service.listar());

       
        model.addAttribute("categorias", categoriaService.listar());
        model.addAttribute("estados", estadoService.listar());

        return "productos";
    }

    // GUARDAR
    @PostMapping
    public String guardar(@ModelAttribute Producto producto) {
        service.guardar(producto);
        return "redirect:/vista/productos";
    }

   
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/vista/productos";
    }
}