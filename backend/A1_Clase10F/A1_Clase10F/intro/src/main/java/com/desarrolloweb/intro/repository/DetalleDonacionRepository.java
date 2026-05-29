package com.desarrolloweb.intro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desarrolloweb.intro.model.DetalleDonacion;

public interface DetalleDonacionRepository extends JpaRepository<DetalleDonacion, Long> {
}
