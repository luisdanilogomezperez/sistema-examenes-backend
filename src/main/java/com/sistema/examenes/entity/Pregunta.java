package com.sistema.examenes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long preguntaId;
    @Getter
    @Setter
    private String contenido;
    @Getter
    @Setter
    private String imagen;
    @Getter
    @Setter
    private String opcion1;
    @Getter
    @Setter
    private String opcion2;
    @Getter
    @Setter
    private String opcion3;
    @Getter
    @Setter
    private String opcion4;
    @Getter
    @Setter
    @Transient
    private String respuestaDada;
    @Getter
    @Setter
    private String respuesta;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Examen examen;

    public Pregunta() {
    }

}
