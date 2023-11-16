package com.grupo2.jump2hackathon.service;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.documents.Geometry;
import com.grupo2.jump2hackathon.documents.Poligono;
import com.grupo2.jump2hackathon.repository.BarrioRepository;
import com.grupo2.jump2hackathon.repository.PoligonoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class BarrioService {
    private final BarrioRepository barrioRepository;
    private final PoligonoRepository poligonoRepository;

    public List<Barrio> getAllBarrios() {
        return barrioRepository.findAll();
    }

    public Optional<Barrio> getBarrioById(UUID id) {

        return barrioRepository.findById(id);
    }

    public List<Barrio> juntarBarrioPoligono(){
        List<Barrio> barriosVacios = barrioRepository.findAll();
        List<Barrio> barrios = barriosVacios.stream().map((barrio -> {
            int codiBarri = Integer.parseInt(barrio.getCodiBarri());
            Poligono poligonoOptional = poligonoRepository.findByCodiBarri(codiBarri);
            barrio.setPoligono(poligonoOptional);
            barrio.setUuid(UUID.randomUUID());
            return barrio;
        })).toList();

        return barrios;
    }

}
