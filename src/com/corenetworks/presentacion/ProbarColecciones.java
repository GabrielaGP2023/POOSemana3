package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Factura;

import java.util.*;

public class ProbarColecciones {
    public static void main(String[] args) {
        //Set - No respeta el orden de entrada
        //No acepta elementos repetidos

        Set conjunto = new HashSet();
        System.out.println("La colección está vacía ? -> " + conjunto.isEmpty());
        conjunto.add("Hola");
        conjunto.add(5);
        conjunto.add(4.5f);
        System.out.println(conjunto);

        System.out.println("Existe el elemento hola -> "+conjunto.contains("Hola"));
        System.out.println("Existe el elemento hola mundo-> "+conjunto.contains("Hola Mundo"));

        System.out.println("Numero de elementos -> " + conjunto.size());
        conjunto.add("Hola mundo");
        System.out.println("Numero de elementos -> " + conjunto.size());
        System.out.println("La colección está vacía ? -> " + conjunto.isEmpty());
        System.out.println("Se ha podido eliminar el elemento hola ->" + conjunto.remove("Hola"));
        System.out.println("Se ha podido añadir el elemento hola -> " + conjunto.add("Hola"));
        System.out.println("Se ha podido añadir el elemento hola -> " + conjunto.add("Hola"));

        Factura f1 = new Factura();
        conjunto.add(f1);
        System.out.println(conjunto);

        // List - Acepta repetidos - Respeta el orden de entrada
        List l1 = new ArrayList();
        l1.add(5);
        l1.add(f1);
        l1.add("hola");
        l1.add("Hola mundo");
        l1.add(5.5f);

        System.out.println(l1);
        System.out.println("Cuantos elementos tiene -> " + l1.size());
        System.out.println("Contiene el elemento hola -> " + l1.contains("hola"));
        System.out.println("Está vacía la lista -> "+ l1.isEmpty());
        System.out.println("Obten el elemento 0 -> "+ l1.get(0));
        //Cambiar el elemento 0
        l1.set(0,7);
        System.out.println(l1);
        System.out.println("En que posición se encuentra \"Hola mundo \"->"+
                l1.indexOf("Hola mundo"));
        System.out.println("Mostrando cada uno de los elementos");
        for(Object elemento : l1){
            System.out.println(elemento);
        }
        System.out.println("Se pudo eliminar el elemento hola -> "+l1.remove("hola"));
        System.out.println(l1);

        //Estructura hashMap
        Map m1 = new HashMap();
        m1.put(1, "Hola");
        m1.put(2, "Hola mundo");
        m1.put(3, f1);
        m1.put(1, "Buenos días");
        System.out.println("Elementos del map -> " + m1);



    }
}
