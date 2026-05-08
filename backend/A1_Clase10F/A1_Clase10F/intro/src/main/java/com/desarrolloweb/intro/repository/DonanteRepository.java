package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.Donante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonanteRepository extends JpaRepository<Donante, Long> {
}