package com.youtube.jwt.service;
import com.youtube.jwt.dao.IndividuRepository;
import com.youtube.jwt.entity.Individus;
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
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ServiceIndividuTest {

    private ServiceIndividu serviceIndividu;

    @Mock
    private IndividuRepository individuRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        serviceIndividu = new ServiceIndividu();
    }

    @Test
    void testSupprimerIndividu() {
        int refIndividuToDelete = 1;

        doNothing().when(individuRepository).deleteById(refIndividuToDelete);

        serviceIndividu.SupprimerIndividu(refIndividuToDelete);

        verify(individuRepository, times(1)).deleteById(refIndividuToDelete);
    }

    @Test
    void testFindAll() {
        List<Individus> individusList = new ArrayList<>();
        individusList.add(new Individus());
        individusList.add(new Individus());

        when(individuRepository.findAll()).thenReturn(individusList);

        List<Individus> result = serviceIndividu.findall();

        assertNotNull(result);
        assertEquals(individusList.size(), result.size());
    }

}
