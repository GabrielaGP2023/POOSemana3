package com.corenetworks.presentacion;

import com.corenetwoks.modelo.PuertaCoche;

public class ProbarCoche {
    public static void main(String[] args) {
        PuertaCoche p1 = new PuertaCoche("Puerta 1",15,100);
        PuertaCoche p2 = new PuertaCoche("Puerta 2",15,105);

        System.out.println("p1: " +p1);
        System.out.println("p2: " +p2);

        p1.abrir();
        p2.abrir();

        System.out.println("Despues de abrir");
        System.out.println("p1: " +p1);
        System.out.println("p2: " +p2);

        p1.cerrar();
        p2.cerrar();

        System.out.println("Despues de cerrar");
        System.out.println("p1: " +p1);
        System.out.println("p2: " +p2);

        p1.abrir();
        p2.cerrar();

        System.out.println("Despues de abrir p1 y cerrar p2");
        System.out.println("p1: " +p1);
        System.out.println("p2: " +p2);
    }
}
