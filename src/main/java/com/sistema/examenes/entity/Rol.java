package com.sistema.examenes.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy="rol")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

    public Rol(){

    }
}
