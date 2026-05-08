package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.EstadoConservacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoConservacionRepository extends JpaRepository<EstadoConservacion, Long> {
}