package com.corenetwoks.modelo;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if(cantidadActual-cantidad >= 0)
            cantidadActual -= cantidad;
        else
            cantidadActual = 0;
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if(cantidadActual + cantidad <= capacidadMaxima)
            cantidadActual += cantidad;
        else
            cantidadActual = capacidadMaxima;
    }
    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int cm) {
        capacidadMaxima = cm;
        cantidadActual = cm;
    }

    public Cafetera(int cm, int ca) {
        capacidadMaxima = cm;
        cantidadActual = ca;
        if(ca>cm)
            cantidadActual = capacidadMaxima;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
