package com.upc.appProductos.repositorio;

import com.upc.appProductos.entidades.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionRepository extends JpaRepository<Seccion, Long> {
}