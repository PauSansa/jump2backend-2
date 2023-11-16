package com.grupo2.jump2hackathon.controller;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.documents.Poligono;
import com.grupo2.jump2hackathon.service.BarrioService;

import com.grupo2.jump2hackathon.service.PoligonoService;
import jakarta.websocket.server.PathParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/barrio")
@RequiredArgsConstructor
public class BarrioController {
    private final BarrioService barrioService;
    private final PoligonoService poligonoService;

    @GetMapping("/test")
    public List<Poligono> getAllBarrios(){

        return poligonoService.getAll();
    }

    @GetMapping("/juntar")
    public List<Barrio> juntarBarrioPoligono(){

        return barrioService.juntarBarrioPoligono();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Barrio>> getAllBarriosController(){

        return new ResponseEntity<>(barrioService.getAllBarrios(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barrio> getBarrioById(@PathVariable(value = "id") UUID id) {
        Optional<Barrio> barrioOptional = barrioService.getBarrioById(id);
        return barrioOptional.map(barrio -> new ResponseEntity<>(barrio, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
