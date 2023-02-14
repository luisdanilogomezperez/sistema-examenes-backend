package com.sistema.examenes.exceptions;

public class UsuarioNotFoundException extends Exception{

    public UsuarioNotFoundException(){
        super("El usuario ingresado no existe en la base de datos, intente con otro nombre de usuario!");
    }

    public UsuarioNotFoundException(String mensaje){
        super(mensaje);
    }
}
