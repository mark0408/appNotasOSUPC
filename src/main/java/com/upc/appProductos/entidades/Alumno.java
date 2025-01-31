package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlumno;

    private String codAlumno;
    private String nombre;
    private String apePat;
    private String apeMat;
    private String fechaNac;
    private int anioIngreso;
}
