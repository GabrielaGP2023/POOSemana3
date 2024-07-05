package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProbarPalabrasDiferentes {
    public static void main(String[] args) {
        // 1. Declaración de variables
        Scanner s1 = new Scanner(System.in);
        String[] palabras;
        String[] puntuacion = {",",".",";",":"};
        Map<String,Integer> diferentes= new HashMap();
        String texto;
        //Solicitar la frase
        System.out.println("Escriba un texto para analizar -> ");
        texto = s1.nextLine();
        //Limpia la frase
        for (String elemento : puntuacion) {
            texto = texto.replace(elemento, " ");
        }
//        System.out.println("texto limpio -> " + texto);
        palabras = texto.split(" ");
        for (String elemento : palabras) {
            if (elemento.trim().length()>0) {
                Integer valor = diferentes.get(elemento.toUpperCase());
                if (valor==null) {
                    diferentes.put(elemento.toUpperCase(), 1);
                }else{
                    diferentes.put(elemento.toUpperCase(), ++valor);
                }
            }
        }
        System.out.println("el hashtable es "+ diferentes);
    }
}
