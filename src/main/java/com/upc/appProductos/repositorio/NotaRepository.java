package com.upc.appProductos.repositorio;


import com.upc.appProductos.entidades.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
