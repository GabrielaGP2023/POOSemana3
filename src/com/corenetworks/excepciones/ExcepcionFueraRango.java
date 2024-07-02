package com.corenetworks.excepciones;

public class ExcepcionFueraRango extends Exception{

    public ExcepcionFueraRango(int indice, int longitudArray) {
        super("Indice fuera de rango su valor es " + indice + " el valor máximo debería ser "
        + longitudArray);
    }
}
