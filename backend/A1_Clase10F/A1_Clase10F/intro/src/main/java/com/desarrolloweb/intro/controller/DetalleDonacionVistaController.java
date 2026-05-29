package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.DetalleDonacion;
import com.desarrolloweb.intro.service.DetalleDonacionService;
import com.desarrolloweb.intro.service.DonacionService;
import com.desarrolloweb.intro.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vista/detalle-donaciones")
public class DetalleDonacionVistaController {

    private final DetalleDonacionService detalleService;
    private final DonacionService donacionService;
    private final ProductoService productoService;

    public DetalleDonacionVistaController(DetalleDonacionService detalleService,
                                         DonacionService donacionService,
                                         ProductoService productoService) {
        this.detalleService = detalleService;
        this.donacionService = donacionService;
        this.productoService = productoService;
    }

    // LISTAR
    @GetMapping
    public String listar(Model model) {

        model.addAttribute("detalles", detalleService.listar());
        model.addAttribute("donaciones", donacionService.listar());
        model.addAttribute("productos", productoService.listar());
        model.addAttribute("detalle", new DetalleDonacion());

        return "detalle_donacion";
    }

    // GUARDAR (CREAR / ACTUALIZAR)
    @PostMapping
    public String guardar(@ModelAttribute DetalleDonacion detalle) {

        // 🔥 REGLA DE NEGOCIO
        if (detalle.getCantidad() == null || detalle.getCantidad() <= 0) {
            throw new RuntimeException("La cantidad debe ser mayor a 0");
        }

        detalleService.guardar(detalle);

        return "redirect:/vista/detalle-donaciones";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        DetalleDonacion detalle = detalleService.buscar(id);

        model.addAttribute("detalle", detalle);
        model.addAttribute("detalles", detalleService.listar());
        model.addAttribute("donaciones", donacionService.listar());
        model.addAttribute("productos", productoService.listar());

        return "detalle_donacion";
    }

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        detalleService.eliminar(id);

        return "redirect:/vista/detalle-donaciones";
    }
}