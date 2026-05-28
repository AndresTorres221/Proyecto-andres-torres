package com.desarrolloweb.intro.service;

import com.desarrolloweb.intro.dto.DonacionDTO;
import com.desarrolloweb.intro.model.Donacion;
import java.util.List;

public interface DonacionService {

    Donacion guardar(Donacion donacion);

    
    List<DonacionDTO> listar();

    DonacionDTO buscar(Long id);

    void eliminar(Long id);
}