package com.desarrolloweb.intro.mapper;

import com.desarrolloweb.intro.dto.*;
import com.desarrolloweb.intro.model.*;

import java.util.List;
import java.util.stream.Collectors;

public class DonacionMapper {

    public static DonacionDTO toDTO(Donacion donacion) {

        DonacionDTO dto = new DonacionDTO();
        dto.setId(donacion.getId());
        dto.setFecha(donacion.getFecha());

        if (donacion.getDonante() != null) {
            DonanteDTO donanteDTO = new DonanteDTO();
            donanteDTO.setId(donacion.getDonante().getId());
            donanteDTO.setNombre(donacion.getDonante().getNombre());
            donanteDTO.setTelefono(donacion.getDonante().getTelefono());
            donanteDTO.setDireccion(donacion.getDonante().getDireccion());

            dto.setDonante(donanteDTO);
        }

        if (donacion.getDetalles() != null) {

            List<DetalleDonacionDTO> detallesDTO = donacion.getDetalles()
                    .stream()
                    .map(detalle -> {

                        DetalleDonacionDTO dDTO = new DetalleDonacionDTO();
                        dDTO.setId(detalle.getId());
                        dDTO.setCantidad(detalle.getCantidad());

                        if (detalle.getProducto() != null) {
                            ProductoDTO pDTO = new ProductoDTO();
                            pDTO.setId(detalle.getProducto().getId());
                            pDTO.setNombre(detalle.getProducto().getNombre());
                            pDTO.setPrecio(detalle.getProducto().getPrecio());

                            dDTO.setProducto(pDTO);
                        }

                        return dDTO;
                    })
                    .collect(Collectors.toList());

            dto.setDetalles(detallesDTO);
        }

        return dto;
    }

   
    public static List<DonacionDTO> toDTOList(List<Donacion> donaciones) {
        return donaciones.stream()
                .map(DonacionMapper::toDTO)
                .collect(Collectors.toList());
    }
}