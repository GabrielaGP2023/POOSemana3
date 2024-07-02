package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Alumno;
import com.corenetworks.excepciones.ExcepcionFueraRango;
import com.corenetworks.excepciones.ExcepcionNotaInvalida;

import java.util.Scanner;

public class ProbarAlumno {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan Lopez",4);
        Scanner s1 = new Scanner(System.in);
        int nota, periodo;
        String continuar;
        do {
            System.out.println("Escriba la nota");
            nota = s1.nextInt();
            System.out.println("Escriba el periodo");
            periodo = s1.nextInt();
            try {
                a1.asignarNota(nota, periodo);
            } catch (ExcepcionNotaInvalida e) {
                System.out.println(e.getMessage());
                ;
            } catch (ExcepcionFueraRango e) {
                System.out.println(e.getMessage());
            }
            System.out.println(a1.toString());
            System.out.println("¿Quiere continuar?");
            continuar = s1.next();
        }while(continuar.equalsIgnoreCase("S"));
    }
}
