package com.youtube.jwt.service;

import com.youtube.jwt.dao.BordereauRepository;
import com.youtube.jwt.entity.Bordereau;
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
public class ServiceBordereauTest {
    private ServiceBordereau serviceBordereau;
    
    @Mock
    private BordereauRepository bordereauRepository;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        serviceBordereau = new ServiceBordereau(bordereauRepository);
    }
    
    @Test
    void testSaisirBordereau() {
        Bordereau bordereau = new Bordereau();
        when(bordereauRepository.save(bordereau)).thenReturn(bordereau);
        serviceBordereau.saisirBordereau(bordereau);
        assertNotEquals(0, bordereau.getNUM_BORD());
    }
    
    @Test
    void testFindAll() {
        List<Bordereau> bordereauList = new ArrayList<>();
        bordereauList.add(new Bordereau());
        bordereauList.add(new Bordereau());
        when(bordereauRepository.findAll()).thenReturn(bordereauList);
        List<Bordereau> result = serviceBordereau.findall();
        assertNotNull(result);
        assertEquals(bordereauList.size(), result.size());
    }
    
    @Test
    void testAnnulerBord() {
        int numBordereauToDelete = 1;
        doNothing().when(bordereauRepository).deleteById(numBordereauToDelete);
        serviceBordereau.annulerBord(numBordereauToDelete);
        verify(bordereauRepository, times(1)).deleteById(numBordereauToDelete);
    }
    
    @Test
    void testUpdate() {
        Bordereau bordereau = new Bordereau();
        when(bordereauRepository.save(bordereau)).thenReturn(bordereau);
        serviceBordereau.update(bordereau);
        assertNotEquals(0, bordereau.getNUM_BORD());
    }
}
