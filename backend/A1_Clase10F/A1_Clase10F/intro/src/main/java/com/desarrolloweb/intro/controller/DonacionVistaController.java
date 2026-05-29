package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.dto.DonacionDTO;
import com.desarrolloweb.intro.model.Donacion;
import com.desarrolloweb.intro.service.DonacionService;
import com.desarrolloweb.intro.service.DonanteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vista/donaciones")
public class DonacionVistaController {

    private final DonacionService donacionService;
    private final DonanteService donanteService;

    public DonacionVistaController(DonacionService donacionService,
                                    DonanteService donanteService) {
        this.donacionService = donacionService;
        this.donanteService = donanteService;
    }

    // LISTAR
    @GetMapping
    public String listar(Model model) {

        model.addAttribute("donaciones", donacionService.listar());
        model.addAttribute("donantes", donanteService.listar());
        model.addAttribute("donacion", new Donacion());

        return "donaciones";
    }

    // GUARDAR (CREAR Y ACTUALIZAR)
    @PostMapping
    public String guardar(@ModelAttribute Donacion donacion) {

        donacionService.guardar(donacion);

        return "redirect:/vista/donaciones";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
public String editar(@PathVariable Long id, Model model) {

    DonacionDTO donacion = donacionService.buscar(id);

    model.addAttribute("donacion", donacion);
    model.addAttribute("donaciones", donacionService.listar());
    model.addAttribute("donantes", donanteService.listar());

    return "donaciones";
}

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        donacionService.eliminar(id);

        return "redirect:/vista/donaciones";
    }
}