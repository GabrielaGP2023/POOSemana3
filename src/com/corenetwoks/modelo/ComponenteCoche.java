package com.corenetwoks.modelo;

public class ComponenteCoche {
    private String descripcion;
    private double peso;
    private double coste;

    @Override
    public String toString() {
        return "ComponenteCoche{" +
                "descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                ", coste=" + coste +
                '}';
    }

    public ComponenteCoche() {
    }

    public ComponenteCoche(String descripcion, double peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }


}
