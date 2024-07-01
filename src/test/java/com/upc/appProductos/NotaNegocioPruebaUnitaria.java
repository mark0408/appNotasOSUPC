package com.upc.appProductos;

import com.upc.appProductos.entidades.Nota;
import com.upc.appProductos.negocio.NotaService;
import com.upc.appProductos.repositorio.NotaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class NotaNegocioPruebaUnitaria {
    @InjectMocks
    private NotaService notaService;

    @Mock
    private NotaRepository notaRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetNotaById() {
        Nota nota = new Nota();
        nota.setIdNota(1L);
        nota.setNota(90.0);

        when(notaRepository.findById(1L)).thenReturn(Optional.of(nota));

        Nota result = notaService.findById(1L);
        assertNotNull(result);
        assertEquals(90.0, result.getNota());

        verify(notaRepository, times(1)).findById(1L);
    }

    @Test
    void testSaveNota() {
        Nota nota = new Nota();
        nota.setNota(90.0);

        when(notaRepository.save(nota)).thenReturn(nota);

        Nota result = notaService.save(nota);
        assertEquals(90.0, result.getNota());

        verify(notaRepository, times(1)).save(nota);
    }

    @Test
    void testDeleteNota() {
        Nota nota = new Nota();
        nota.setIdNota(1L);

        when(notaRepository.findById(1L)).thenReturn(Optional.of(nota));
        doNothing().when(notaRepository).delete(nota);

        notaService.deleteById(1L);

        verify(notaRepository, times(1)).findById(1L);
        verify(notaRepository, times(1)).delete(nota);
    }
}
