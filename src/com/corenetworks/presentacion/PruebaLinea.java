package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Linea;
import com.corenetwoks.modelo.Punto;

public class PruebaLinea {
    public static void main(String[] args) {
        Punto p1 = new Punto(1,2);
        Punto p2 = new Punto(5,2);

        Linea lin1 = new Linea(p1,p2);

        System.out.println("Linea 1:" + lin1);

        lin1.mueveDerecha(2);
        System.out.println("Linea 1 (derecha 2):" + lin1);

        lin1.mueveIzquierda(3);
        System.out.println("Linea 1 (izquierda 3):" + lin1);

        lin1.mueveArriba(5);
        System.out.println("Linea 1 (arriba 5):" + lin1);

        lin1.mueveAbajo(2.5);
        System.out.println("Linea 1 (abajo 2.5):" + lin1);
    }
}
