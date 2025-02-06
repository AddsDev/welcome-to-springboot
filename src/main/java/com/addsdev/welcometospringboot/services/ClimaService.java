package com.addsdev.welcometospringboot.services;

import com.addsdev.welcometospringboot.models.Clima;

import java.time.LocalDate;
import java.util.List;

public interface ClimaService {
    List<Clima> getAllClimas();
    List<Clima> getClimaByCiudad(String ciudad);
    List<Clima> getClimaByFecha(LocalDate fecha);
    List<Clima> getClimaByCiudadAndFecha(String ciudad, LocalDate fecha);
    Clima createClima(Clima clima);
    Boolean deleteClima(Long id);
    Clima updateClima(Long id, Clima clima);

}
