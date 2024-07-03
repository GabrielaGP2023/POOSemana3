package com.corenetwoks.modelo;

public class Linea {
    private Punto puntoA;
    private Punto puntoB;

    @Override
    public String toString() {
        return "Linea{" +
                "puntoA=" + puntoA +
                ", puntoB=" + puntoB +
                '}';
    }

    public void mueveDerecha(double d) {
        puntoA.setX(puntoA.getX()+d);
        puntoB.setX(puntoB.getX()+d);
    }

    public void mueveIzquierda(double d) {
        puntoA.setX(puntoA.getX()-d);
        puntoB.setX(puntoB.getX()-d);
    }

    public void mueveArriba(double d) {
        puntoA.setY(puntoA.getY()+d);
        puntoB.setY(puntoB.getY()+d);
    }

    public void mueveAbajo(double d) {
        puntoA.setY(puntoA.getY()-d);
        puntoB.setY(puntoB.getY()-d);
    }

    public Linea() {
        puntoA = new Punto();
        puntoB = new Punto();
    }

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
}
