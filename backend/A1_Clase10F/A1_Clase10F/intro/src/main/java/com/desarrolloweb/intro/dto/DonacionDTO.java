package com.desarrolloweb.intro.dto;

import java.time.LocalDate;
import java.util.List;

public class DonacionDTO {

    private Long id;
    private LocalDate fecha;
    private DonanteDTO donante;
    private List<DetalleDonacionDTO> detalles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public DonanteDTO getDonante() {
        return donante;
    }

    public void setDonante(DonanteDTO donante) {
        this.donante = donante;
    }

    public List<DetalleDonacionDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleDonacionDTO> detalles) {
        this.detalles = detalles;
    }
}