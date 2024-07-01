package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_seccion")
public class Seccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codSeccion;
    private Long idCurso;
    private Long idSyllabus;
    private Long idProfesor;
    private Long idEstado;

    // Getters and Setters
}
