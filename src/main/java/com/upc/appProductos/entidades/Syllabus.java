package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Syllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSyllabus;

    private String codSyllabus;
    private String descripcion;
    private int anioSyllabus;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
}