package com.upc.appProductos.repositorio;

import com.upc.appProductos.entidades.Practica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PracticaRepository extends JpaRepository<Practica, Long> {
}