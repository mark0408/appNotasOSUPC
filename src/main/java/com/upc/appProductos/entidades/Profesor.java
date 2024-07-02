package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesor;

    private String codProfesor;
    private String nombreProfesor;
    private String apePat;
    private String apeMat;
    private String fechaNacimiento;
    private int anioContratacion;
}