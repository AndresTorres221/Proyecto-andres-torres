package com.desarrolloweb.intro.controller;

import com.desarrolloweb.intro.model.DetalleDonacion;
import com.desarrolloweb.intro.service.DetalleDonacionService;
import com.desarrolloweb.intro.service.DonacionService;
import com.desarrolloweb.intro.service.ProductoService;
import com.desarrolloweb.intro.service.DonanteService; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vista/detalle-donaciones")
public class DetalleDonacionVistaController {

    private final DetalleDonacionService detalleService;
    private final DonacionService donacionService;
    private final ProductoService productoService;
    private final DonanteService donanteService; 


    public DetalleDonacionVistaController(DetalleDonacionService detalleService,
                                         DonacionService donacionService,
                                         ProductoService productoService,
                                         DonanteService donanteService) {
        this.detalleService = detalleService;
        this.donacionService = donacionService;
        this.productoService = productoService;
        this.donanteService = donanteService;
    }

  
    @GetMapping
    public String listar(Model model) {

        model.addAttribute("detalles", detalleService.listar());
        model.addAttribute("donaciones", donacionService.listar());
        model.addAttribute("productos", productoService.listar());
        model.addAttribute("donantes", donanteService.listar()); // 4. AGREGAR LOS DONANTES AL MODELO
        model.addAttribute("detalle", new DetalleDonacion());

        return "detalle_donacion";
    }

    
    @PostMapping
    public String guardar(@ModelAttribute DetalleDonacion detalle) {

        if (detalle.getDonacion() == null || detalle.getDonacion().getId() == null) {
            throw new RuntimeException("Donación no seleccionada");
        }

        if (detalle.getProducto() == null || detalle.getProducto().getId() == null) {
            throw new RuntimeException("Producto no seleccionado");
        }

        if (detalle.getCantidad() == null || detalle.getCantidad() <= 0) {
            throw new RuntimeException("Cantidad inválida");
        }

        detalleService.guardar(detalle);

        return "redirect:/vista/detalle-donaciones";
    }

    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        DetalleDonacion detalle = detalleService.buscar(id);

        model.addAttribute("detalle", detalle);
        model.addAttribute("detalles", detalleService.listar());
        model.addAttribute("donaciones", donacionService.listar());
        model.addAttribute("productos", productoService.listar());
        model.addAttribute("donantes", donanteService.listar()); 
        return "detalle_donacion";
    }

    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        detalleService.eliminar(id);

        return "redirect:/vista/detalle-donaciones";
    }
}