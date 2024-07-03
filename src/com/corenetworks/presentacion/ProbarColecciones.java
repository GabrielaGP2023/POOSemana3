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
        m1.put("h", "Hola ");
        m1.put("f2", f1);
        System.out.println("Elementos del map -> " + m1);
        System.out.println("Obtener el elemento f2 -> " + m1.get("f2"));
        System.out.println("Obtener el elemento f2 -> " + ((Factura) m1.get("f2")).getIdFactura());
        System.out.println("Recorrer la columna de la tabla");
        //Recorrer los valores del Map (Tabla)
        for(Object elemento : m1.values()){
            System.out.println(elemento);
        }
        System.out.println("Recorrer las claves del mapa");
        for(Object elemento : m1.keySet()){
            System.out.println("Clave -> " + elemento);
            System.out.println("Valor -> " + m1.get(elemento));
        }
//        Ejercicio 1
//        Cree una clase que tenga un objeto de la clase HashSet, que añada varias cadenas al objeto e imprima todas las cadenas. Utilizar el tipo genérico String.
        Set<String> ejercicio1 = new HashSet<>();
        ejercicio1.add("Buenos días");
        ejercicio1.add("Buenas tardes");
        ejercicio1.add("Buenas noches");
        for(Object elemento : ejercicio1){
            System.out.println(elemento);
        }
//                Ejercicio 2
//        Cree un objeto de la clase ArrayList, añada una lista de cadenas y utilice un bucle for each.
        List<String> ejercicio2 = new ArrayList();
        ejercicio2.add("Buenos días");
        ejercicio2.add("Buenas tardes");
        ejercicio2.add("Buenas noches");
        System.out.println("---Ejercicio 2 ---");
        for (Object elemento : ejercicio2){
            System.out.println(elemento);
        }
//                Ejercicio 3
//        Cree un programa almacene números del 0 al 9 en un array y en una lista, e imprima sus valores.
        int[] arrayEj3 = new int[10];
        List<Integer> listaEj3 = new ArrayList<>();
        System.out.println("---Ejercicio 3 ---");
        for(int i=0; i<10; i++){
            arrayEj3[i] = i;
            listaEj3.add(i);
            System.out.println("Elemento del array "+ arrayEj3[i]);
            System.out.println("Elemento del ArrayList " + listaEj3.get(i));
            if(listaEj3.get(i)==8){
                System.out.println("Es un 8 ");
            }
        }
//                Ejercicio 4
//        Cree un programa que almacene la nota de una asignatura de varios alumnos en una colección de tipo Map. El alumno se identificará por su nombre.
//                Cada elemento del mapa estará formado por nombre de tipo String y nota de tipo Integer. Utilizar tipos genéricos.
        Map<String,Integer> mapEj4 = new HashMap<>();
        mapEj4.put("Juan Lopez",8);
        mapEj4.put("Ana Flores",9);
        mapEj4.put("Jorge Bueno",9);
        System.out.println("--Ejercicio 4 --");
        for(Object elemento : mapEj4.keySet()){
            System.out.println("La clave es " + elemento + " - " + mapEj4.get(elemento));
            if( mapEj4.get(elemento)>=5){
                System.out.println("Esta aprobado");
            }else{
                System.out.println("Esta suspendido");
            }
        }


//        Ejercicio 5
//        Cree un programa que implemente un diccionario. El diccionario debe contener palabras en castellano y una lista de posibles significados de cada palabra.
//        Crear la clase Palabra que permita almacenar la información de una palabra, junto con sus definiciones.
//                Utilizar un objeto HashMap para almacenar palabras en la clase Diccionario.

        Map<String,List<String>> diccionario = new HashMap<>();
        List<String> definicion = new ArrayList<>();
        definicion.add("Mueble para sentarse");
        definicion.add("Institucion");
        definicion.add("Conjunto de peces");
        diccionario.put("banco",definicion);
        System.out.println(diccionario);
        List<String> definicion2 = new ArrayList<>();
        definicion2.add("Java Develoment Kit");
        diccionario.put("JDK",definicion2);

    }
}
