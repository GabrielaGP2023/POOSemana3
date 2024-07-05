package com.corenetworks.presentacion;

import java.util.Map;

public class EjercicosPracticosAntesExamen {
    public static void main(String[] args) {
//        Ejercicio 0. Realizar la raíz cuadrada de 225 en un procedimiento main.
        double n1 = 225;
        System.out.println(Math.pow(225, 0.5));

//        Ejercicio 1. Realizar un procedimiento main que realice el promedio de 5 números
//        que se almacene en un array de números float y se muestren sus datos.
        // Inicializar un array con 5 números flotantes
        float[] numeros = {1.2f, 2.4f, 3.6f, 4.8f, 5.0f};
        // Calcular el promedio
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        float promedio = suma / numeros.length;
        // Mostrar los datos
        System.out.println("Números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Promedio: " + promedio);


//        Ejercicio 2. Realizar un procedimiento main que realice la suma de dos matrices, se inicializan las matrices en el procedimiento y se muestra el resultado.
        // Inicializar dos matrices 3x3
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Crear una matriz para almacenar la suma
        int[][] sumaM = new int[3][3];

        // Realizar la suma de las matrices
        for (int i = 0; i < sumaM.length; i++) {
            for (int j = 0; j < sumaM.length; j++) {
                sumaM[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar el resultado
        System.out.println("Suma de las matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumaM[i][j] + " ");
            }
            System.out.println();
        }

//        Ejercicio 3. Realizar un procedimiento main que realice el cálculo de la letra del DNI cuyo algoritmo es el siguiente:
//        La letra del NIF se obtiene a partir de un algoritmo conocido como módulo 23. El algoritmo consiste en aplicar la operación aritmética de módulo 23 al número del DNI.
//        El módulo 23 es el número entero obtenido como resto de la división entera del número del DNI entre 23.
//        El resultado es un número comprendido entre el 0 y el 22.
//        En base a una tabla conocida se asigna una letra. La combinación del DNI con esa letra es el NIF.
//        i.	Tabla de asignación
//        0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
//        T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E
//        No se utilizan las letras: I, Ñ, O, U
//        La I y la O se descartan para evitar confusiones con otros caracteres, como 1, l o 0.
        // Tabla de letras según el módulo 23
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        // Número de DNI de ejemplo
        int dni = 51483996;

        // Calcular el módulo 23
        int modulo = dni % 23;

        // Obtener la letra correspondiente
        char letra = letras[modulo];

        // Mostrar el resultado
        System.out.println("DNI: " + dni + "-" + letra);
    }

    }

