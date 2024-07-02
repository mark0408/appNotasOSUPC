package com.upc.appProductos.repositorio;

import com.upc.appProductos.entidades.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyllabusRepository extends JpaRepository<Syllabus, Long> {
}