package com.addsdev.welcometospringboot.services;

import com.addsdev.welcometospringboot.models.Clima;
import com.addsdev.welcometospringboot.repositories.ClimaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClimaServiceImpl implements ClimaService {

    @Autowired
    ClimaRepository climaRepository;

    @Override
    public List<Clima> getAllClimas() {
        return climaRepository.findAll();
    }

    @Override
    public List<Clima> getClimaByCiudad(String ciudad) {
        return climaRepository.findByCiudad(ciudad);
    }

    @Override
    public List<Clima> getClimaByFecha(LocalDate fecha) {
        return climaRepository.findByFecha(fecha);
    }

    @Override
    public List<Clima> getClimaByCiudadAndFecha(String ciudad, LocalDate fecha) {
        return climaRepository.findByCiudadAndFecha(ciudad, fecha);
    }

    @Override
    public Clima createClima(Clima clima) {
        return climaRepository.save(clima);
    }

    @Override
    public Boolean deleteClima(Long id) {
        return climaRepository.findById(id)
                .map(clima -> {
                    climaRepository.delete(clima);
                    return true; // 204 No Content
                })
                .orElse(false);
    }

    @Override
    public Clima updateClima(Long id, Clima clima) {
        return climaRepository.findById(id)
                .map(climaExistente -> {
                    climaExistente.setCiudad(clima.getCiudad());
                    climaExistente.setTemperatura(clima.getTemperatura());
                    climaExistente.setHumedad(clima.getHumedad());
                    climaExistente.setFecha(clima.getFecha());
                    climaExistente.setCondicion(clima.getCondicion());
                    return climaRepository.save(climaExistente);
                })
                .orElse(null);
    }
}
