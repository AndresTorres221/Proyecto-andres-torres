package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.DetalleDonacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface DetalleDonacionRepository extends JpaRepository<DetalleDonacion, Long> {

    @Modifying
@Transactional
@Query("DELETE FROM DetalleDonacion d WHERE d.producto.id = :id")
void eliminarPorProducto(Long id);
}