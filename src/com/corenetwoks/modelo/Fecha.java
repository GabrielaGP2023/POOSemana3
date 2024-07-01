package com.corenetwoks.modelo;

public class Fecha {
    //atributos
    private int anio;
    private int mes;
    private int dia;

    @Override
    public String toString() {
        return "Fecha{" +
                "anio=" + anio +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }

    public Fecha() {
    }

    public Fecha(int anio, int mes, int dia) throws Exception {
        this.anio = anio;
        setMes(mes);
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if(mes>=1 && mes<=12){
        this.mes = mes;}
        else{
            throw new Exception("El mes debe estar en el rango de 1 a 12");
        }
    }

    public int getDia() {
        //Validar que esté en el rango de 1 a 30
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
