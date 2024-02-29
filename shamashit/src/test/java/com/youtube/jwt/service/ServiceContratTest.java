package com.youtube.jwt.service;

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
class ServiceContratTest {
    private ServiceContrat serviceContrat;
    
    @Mock
    private ContratRepository contratRepository;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        serviceContrat = new ServiceContrat(contratRepository);
    }
    
    @Test
    void testModifierContrat() {
        Contrat contrat = new Contrat();
        when(contratRepository.save(contrat)).thenReturn(contrat);
        serviceContrat.modifierContrat(contrat);
        assertNotNull(contrat.getREF_CTR());
    }
    
    @Test
    void testFindAll() {
        List<Contrat> contratList = new ArrayList<>();
        contratList.add(new Contrat());
        contratList.add(new Contrat());
        when(contratRepository.findAll()).thenReturn(contratList);
        List<Contrat> result = serviceContrat.findAll();
        assertNotNull(result);
        assertEquals(contratList.size(), result.size());
    }
}
