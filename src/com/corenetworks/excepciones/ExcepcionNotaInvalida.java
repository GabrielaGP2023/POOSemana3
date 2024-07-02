package com.corenetworks.excepciones;

public class ExcepcionNotaInvalida extends Exception{

    public ExcepcionNotaInvalida(int nota) {
        super("La nota debe estar en un rango de 0 a 10 y el número enviado es ..."+ nota);
    }
}
