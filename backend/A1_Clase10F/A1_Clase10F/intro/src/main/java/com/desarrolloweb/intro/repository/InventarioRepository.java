package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}