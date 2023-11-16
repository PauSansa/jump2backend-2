package com.grupo2.jump2hackathon.service;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.documents.Geometry;
import com.grupo2.jump2hackathon.documents.Poligono;
import com.grupo2.jump2hackathon.repository.BarrioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class BarrioService {
    private final BarrioRepository barrioRepository;

    public List<Barrio> getAllBarrios() {
        return barrioRepository.findAll();
    }

}
