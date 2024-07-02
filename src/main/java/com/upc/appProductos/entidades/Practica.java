package com.upc.appProductos.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPractica;

    private String codPractica;
    private double pesoPractica;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
}
