package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codAlumno;
    private String nombre;
    private String apePat;
    private String apeMat;
    private String fechaNac;
    private String anioIngreso;
    private Long idCurso;
    private Long idEstado;

    // Getters and Setters
}
