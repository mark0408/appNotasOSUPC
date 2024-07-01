package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    private double nota;

    @ManyToOne
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "id_practica", nullable = false)
    private Practica practica;

    @ManyToOne
    @JoinColumn(name = "id_seccion", nullable = false)
    private Seccion seccion;

}
