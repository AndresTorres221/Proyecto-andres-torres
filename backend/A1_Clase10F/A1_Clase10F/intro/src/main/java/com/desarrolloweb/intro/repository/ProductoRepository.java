package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}