package com.grupo2.jump2hackathon.repository;

import com.grupo2.jump2hackathon.documents.Barrio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataMongoTest
class BarrioRepositoryTest {

    @Autowired
    private BarrioRepository barrioRepository;

    @Test
    void testFindAll() {
        List<Barrio> barrios = barrioRepository.findAll();
        assertNotNull(barrios);
        assertEquals(76, barrios.size());
    }
}