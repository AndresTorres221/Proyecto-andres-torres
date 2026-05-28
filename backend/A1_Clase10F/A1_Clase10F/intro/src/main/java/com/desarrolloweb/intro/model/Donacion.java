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

    
    @ManyToOne
    @JoinColumn(name = "donante_id")
    private Donante donante;

    
   @OneToMany(mappedBy = "donacion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<DetalleDonacion> detalles;
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