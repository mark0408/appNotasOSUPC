package com.upc.appProductos.negocio;

import com.upc.appProductos.entidades.Nota;
import com.upc.appProductos.repositorio.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;

    public List<Nota> findAll() {
        return notaRepository.findAll();
    }

    public Nota findById(Long id) {
        return notaRepository.findById(id).orElse(null);
    }

    public Nota save(Nota nota) {
        return notaRepository.save(nota);
    }

    public void deleteById(Long id) {
        notaRepository.deleteById(id);
    }
}