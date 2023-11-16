package com.grupo2.jump2hackathon.service;

import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.repository.BarrioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BarrioServiceTest {
    @InjectMocks
    private BarrioService barrioService;
    @Mock
    private BarrioRepository barrioRepository;

    private Barrio b1;
    private Barrio b2;
    private Barrio b3;

    private List<Barrio> barrios;

    @BeforeEach
    void setUp(){
        b1 = new Barrio();
        b2 = new Barrio();
        b3 = new Barrio();

        barrios = new ArrayList<>();

        barrios.add(b1);
        barrios.add(b2);
        barrios.add(b3);
    }

    @Test
    void getAllBarriosTest(){
        when(barrioRepository.findAll()).thenReturn(barrios);

        List<Barrio> misBarrios = barrioService.getAllBarrios();

        assertNotNull(misBarrios);
        assertEquals(misBarrios.get(0), b1);
        assertEquals(misBarrios.get(1), b2);
        assertEquals(misBarrios.get(2), b3);
    }
}
