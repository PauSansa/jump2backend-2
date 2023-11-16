package com.grupo2.jump2hackathon.controller;
import com.grupo2.jump2hackathon.documents.Barrio;
import com.grupo2.jump2hackathon.service.BarrioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class BarrioControllerTest {

    @Mock
    private BarrioService barrioService;
    @InjectMocks
    private BarrioController barrioController;

    private Barrio b1;
    private Barrio b2;
    private Barrio b3;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        b1 = new Barrio();
        b2 = new Barrio();
        b3 = new Barrio();
    }

    @Test
    void getAllBarriosControllerTest() {
        List<Barrio> barrios = Arrays.asList(b1, b2, b3);
        when(barrioService.getAllBarrios()).thenReturn(barrios);

        ResponseEntity<List<Barrio>> response = barrioController.getAllBarriosController();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(barrios, response.getBody());
    }
}