package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.CategoriaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Long> {
}