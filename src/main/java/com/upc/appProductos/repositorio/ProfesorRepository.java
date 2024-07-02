package com.upc.appProductos.repositorio;

import com.upc.appProductos.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}