package com.upc.appProductos.rest;

import com.upc.appProductos.entidades.Nota;
import com.upc.appProductos.negocio.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotaRest {

    @Autowired
    private NotaService notaService;

    @GetMapping
    public List<Nota> getAllNotas() {
        return notaService.findAll();
    }

    @GetMapping("/{id}")
    public Nota getNotaById(@PathVariable Long id) {
        return notaService.findById(id);
    }

    @PostMapping
    public Nota createNota(@RequestBody Nota nota) {
        return notaService.save(nota);
    }

    @PutMapping("/{id}")
    public Nota updateNota(@PathVariable Long id, @RequestBody Nota notaDetails) {
        Nota nota = notaService.findById(id);
        if (nota != null) {

            nota.setAlumno(notaDetails.getAlumno());
            nota.setPractica(notaDetails.getPractica());
            nota.setSeccion(notaDetails.getSeccion());
            nota.setNota(notaDetails.getNota());
            return notaService.save(nota);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteNota(@PathVariable Long id) {
        notaService.deleteById(id);
    }
}
