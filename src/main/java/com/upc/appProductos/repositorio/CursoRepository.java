package com.upc.appProductos.repositorio;

import com.upc.appProductos.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}