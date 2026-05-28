package com.desarrolloweb.intro.repository;

import com.desarrolloweb.intro.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
}