package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_practica")
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codPractica;
    private Long idCurso;
    private Double pesoPractica;
    private Long idEstado;

    // Getters and Setters
}
