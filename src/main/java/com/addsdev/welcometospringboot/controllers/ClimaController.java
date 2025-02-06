package com.addsdev.welcometospringboot.controllers;

import com.addsdev.welcometospringboot.models.Clima;
import com.addsdev.welcometospringboot.services.ClimaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/clima")
public class ClimaController {

    @Autowired
    ClimaService service;

    @GetMapping
    public List<Clima> getAllClimas() {
        return service.getAllClimas();
    }

    @GetMapping("/ciudad/{ciudad}")
    public List<Clima> getClimaByCiudad(@PathVariable String ciudad) {
        return service.getClimaByCiudad(ciudad);
    }

    @GetMapping("/fecha/{fecha}")
    public List<Clima> getClimaByFecha(@PathVariable String fecha) {
        return service.getClimaByFecha(LocalDate.parse(fecha));
    }
    @GetMapping("/{ciudad}/{fecha}")
    public List<Clima> getClimaByCiudadAndFecha(@PathVariable String ciudad, @PathVariable String fecha) {
        return service.getClimaByCiudadAndFecha(ciudad,LocalDate.parse(fecha));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clima createClima(@RequestBody Clima clima) {
        return service.createClima(clima);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteClima(@PathVariable Long id) {
    return service.deleteClima(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clima> updateClima(@PathVariable Long id, @Valid @RequestBody Clima clima) {
        var response = service.updateClima(id, clima);
        return response == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(response);
    }


}
