package com.sistema.examenes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long examenId;

    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private String descripcion;
    @Getter
    @Setter
    private String  puntosMaximos;
    @Getter
    @Setter
    private String numeroDePreguntas;
    @Getter
    @Setter
    private boolean activo=true;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "examen")
    @JsonIgnore
    private Set<Pregunta> preguntas = new LinkedHashSet<>();

    public Examen() {
    }
}
