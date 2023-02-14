package com.sistema.examenes.exceptions;

public class UsuarioFoundException extends Exception{

    public UsuarioFoundException(){
        super("El usuario ya existe en la base de datos, intente con otro nombre de usuario!");
    }

    public UsuarioFoundException(String mensaje){
        super(mensaje);
    }
}
