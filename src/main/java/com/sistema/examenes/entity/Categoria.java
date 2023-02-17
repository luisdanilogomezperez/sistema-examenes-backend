package com.sistema.examenes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long categoriaId;

    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    @JsonIgnore
    private Set<Examen> examenes = new LinkedHashSet<>();

    public Categoria() {
    }

}
