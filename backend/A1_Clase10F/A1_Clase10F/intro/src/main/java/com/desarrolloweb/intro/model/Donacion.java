package com.desarrolloweb.intro.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "donacion")
public class Donacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY) // Optimizado a LAZY
    @JoinColumn(name = "donante_id")
    private Donante donante;

    // CORRECCIÓN: Se añade orphanRemoval = true y cambiamos a LAZY para evitar consultas pesadas duplicadas
    @OneToMany(mappedBy = "donacion", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DetalleDonacion> detalles;

    public Donacion() {
    }

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

    public Donante getDonante() {
        return donante;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    public List<DetalleDonacion> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleDonacion> detalles) {
        this.detalles = detalles;
    }
}