package com.corenetwoks.modelo;

import com.corenetworks.excepciones.ExcepcionFueraRango;
import com.corenetworks.excepciones.ExcepcionNotaInvalida;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private int[] notas;
    //Actualiza las notas en los periodos
    public void asignarNota(int nota, int periodo) throws ExcepcionNotaInvalida, ExcepcionFueraRango {
        //validar nota
        if(nota >= 0 && nota <=10){
            //Todo ok
            if(periodo>=1 && periodo<=notas.length){
                //La nota es correcta y el periodo tb
                notas[periodo-1]=nota;
            }else{
                throw new ExcepcionFueraRango(periodo,notas.length);
            }
        }else{
            //Si entra aquí, no es válida la nota
            throw new ExcepcionNotaInvalida(nota);
        }


    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    //Constructores
    public Alumno(int numeroNotas) {
        notas = new int[numeroNotas];
    }

    public Alumno(String nombre, int numeroNotas) {
        this(numeroNotas);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
