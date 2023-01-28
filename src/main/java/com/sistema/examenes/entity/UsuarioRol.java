package com.sistema.examenes.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter @Column(name = "usuario_rol_id")
    private Long usuarioRolId;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Rol rol;

    public UsuarioRol(){

    }

}
