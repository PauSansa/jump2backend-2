package com.grupo2.jump2hackathon.controller;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.documents.Poligono;
import com.grupo2.jump2hackathon.service.BarrioService;

import jakarta.websocket.server.PathParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/barrio")
@RequiredArgsConstructor
public class BarrioController {

    @Autowired
    private final BarrioService barrioService;

    @GetMapping("/all")
    @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<List<Barrio>> getAllBarriosController(){
        return new ResponseEntity<>(barrioService.getAllBarrios(), HttpStatus.OK);
    }

}
