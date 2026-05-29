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

    private final ProductoService productoService;
    private final CategoriaProductoService categoriaService;
    private final EstadoConservacionService estadoService;

    public ProductoVistaController(ProductoService productoService,
                                   CategoriaProductoService categoriaService,
                                   EstadoConservacionService estadoService) {
        this.productoService = productoService;
        this.categoriaService = categoriaService;
        this.estadoService = estadoService;
    }

    // LISTAR
    @GetMapping
    public String listar(Model model) {

        model.addAttribute("productos", productoService.listar());
        model.addAttribute("producto", new Producto());

        model.addAttribute("categorias", categoriaService.listar());
        model.addAttribute("estados", estadoService.listar());

        return "productos";
    }

    // GUARDAR (CREATE + UPDATE)
    @PostMapping
    public String guardar(@ModelAttribute Producto producto) {

        productoService.guardar(producto);

        return "redirect:/vista/productos";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Producto producto = productoService.buscar(id);

        model.addAttribute("producto", producto);
        model.addAttribute("productos", productoService.listar());

        model.addAttribute("categorias", categoriaService.listar());
        model.addAttribute("estados", estadoService.listar());

        return "productos";
    }

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        productoService.eliminar(id);

        return "redirect:/vista/productos";
    }
}