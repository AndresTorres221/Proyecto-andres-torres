package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.model.EstadoConservacion;
import java.util.List;

public interface EstadoConservacionService {

    EstadoConservacion guardar(EstadoConservacion estado);

    List<EstadoConservacion> listar();
}