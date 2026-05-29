package com.desarrolloweb.intro.controller;


import com.desarrolloweb.intro.model.DetalleDonacion;
import com.desarrolloweb.intro.model.Donacion;
import com.desarrolloweb.intro.service.DetalleDonacionService;
import com.desarrolloweb.intro.service.DonacionService;
import com.desarrolloweb.intro.service.DonanteService;
import com.desarrolloweb.intro.service.ProductoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vista/donaciones")
public class DonacionVistaController {

    private final DonacionService donacionService;
    private final DonanteService donanteService;
    private final ProductoService productoService;
    private final DetalleDonacionService detalleService;

    public DonacionVistaController(DonacionService donacionService,
                                    DonanteService donanteService,
                                    ProductoService productoService,
                                    DetalleDonacionService detalleService) {
        this.donacionService = donacionService;
        this.donanteService = donanteService;
        this.productoService = productoService;
        this.detalleService = detalleService;
    }

    // LISTAR
  @GetMapping
public String listar(Model model) {

    model.addAttribute("donaciones", donacionService.listar());
    model.addAttribute("donantes", donanteService.listar());
    model.addAttribute("productos", productoService.listar());
    model.addAttribute("detalles", detalleService.listar());

    model.addAttribute("donacion", new Donacion());
    model.addAttribute("detalle", new DetalleDonacion());

    return "detalle_donacion";
}

@GetMapping("/editar/{id}")
public String editar(@PathVariable Long id, Model model) {

    Donacion donacion = donacionService.buscar(id);

    model.addAttribute("donacion", donacion);
    model.addAttribute("donaciones", donacionService.listar());
    model.addAttribute("donantes", donanteService.listar());
    model.addAttribute("productos", productoService.listar());
    model.addAttribute("detalles", detalleService.listar());
    model.addAttribute("detalle", new DetalleDonacion());

    return "detalle_donacion";
}

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        donacionService.eliminar(id);

        return "redirect:/vista/donaciones";
    }

    @PostMapping
public String guardar(@ModelAttribute Donacion donacion) {

    donacionService.guardar(donacion);

    return "redirect:/vista/donaciones";
}
}