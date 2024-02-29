package com.youtube.jwt.service;
import com.youtube.jwt.dao.EncaissementRepository;
import com.youtube.jwt.entity.Encaissement;
import com.youtube.jwt.dao.ContratRepository;
import com.youtube.jwt.entity.Contrat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ServiceEncaissementTest {
    private ServiceEncaissement serviceEncaissement;

    @Mock
    private EncaissementRepository encaissementRepository;

    @Mock
    private ContratRepository contratRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        serviceEncaissement = new ServiceEncaissement(encaissementRepository, contratRepository);
    }

    @Test
    void testAjouterEncaissement() {
        Encaissement encaissement = new Encaissement();
        when(encaissementRepository.save(encaissement)).thenReturn(encaissement);
        serviceEncaissement.ajouterEncaissement(encaissement);
        assertNotNull(encaissement.getID_ENC());
    }

    @Test
    void testModifierEncaissement() {
        Encaissement encaissement = new Encaissement();
        when(encaissementRepository.save(encaissement)).thenReturn(encaissement);
        serviceEncaissement.modifierEncaissement(encaissement);
        assertNotNull(encaissement.getID_ENC());
    }

    @Test
    void testFindAll() {
        List<Encaissement> encaissementList = new ArrayList<>();
        encaissementList.add(new Encaissement());
        encaissementList.add(new Encaissement());
        when(encaissementRepository.findAll()).thenReturn(encaissementList);
        List<Encaissement> result = serviceEncaissement.findAll();
        assertNotNull(result);
        assertEquals(encaissementList.size(), result.size());
    }
}
