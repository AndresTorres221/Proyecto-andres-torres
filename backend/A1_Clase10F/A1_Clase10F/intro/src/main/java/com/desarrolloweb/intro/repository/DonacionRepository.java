package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonacionRepository extends JpaRepository<Donacion, Long> {

   @Query("SELECT d FROM Donacion d LEFT JOIN FETCH d.detalles")
List<Donacion> findAllWithDetalles();
}