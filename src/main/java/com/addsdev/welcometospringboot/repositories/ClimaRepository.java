package com.addsdev.welcometospringboot.repositories;

import com.addsdev.welcometospringboot.models.Clima;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ClimaRepository extends JpaRepository<Clima, Long> {
    List<Clima> findByCiudad(String ciudad);
    List<Clima> findByFecha(LocalDate fecha);
    List<Clima> findByCiudadAndFecha(String ciudad, LocalDate fecha);
}
