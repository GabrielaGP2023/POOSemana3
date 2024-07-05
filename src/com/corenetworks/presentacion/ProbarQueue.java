package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Alumno;
import com.corenetworks.excepciones.ExcepcionFueraRango;
import com.corenetworks.excepciones.ExcepcionNotaInvalida;

import java.util.*;

public class ProbarQueue {

    private static Queue<Alumno> filaDeInscripcion = new ArrayDeque<>();
    private static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {
//        Queue filaSupermercado = new ArrayDeque(20);
//        filaSupermercado.offer(2);
//        filaSupermercado.offer(3);
//        filaSupermercado.offer(5);
//
//        System.out.println(filaSupermercado);
//        System.out.println("Sacar de la filla");
//        System.out.println(filaSupermercado.poll());
//        System.out.println("Cómo queda la fila ? " + filaSupermercado);

        //Declarar una cola de alumnos con el nombre de filaDeInscripcion
        int opcion;
        do{
            mostrarMenu();
            opcion = s1.nextInt();
            switch (opcion){
                case 1 -> altaAlumno();
                case 2 -> System.out.println("Se ha atendido al alumno "+ filaDeInscripcion.poll());
                case 3 -> atenderTodos();
                case 4 -> System.out.println(filaDeInscripcion);
            }
        }while (opcion>=1 && opcion<=4);
    }

    private static void atenderTodos() {
        for(Alumno elemento: filaDeInscripcion){
            System.out.println("Se ha atendido al alumno "+ filaDeInscripcion.poll());
        }
    }

    private static void altaAlumno() {
        String nombre;
        int meses,nota;
        System.out.println("---Datos del alumno ---");
        System.out.println("Escriba el nombre del alumno ->");
        nombre = s1.next();
        System.out.println("Escriba el número de meses -> ");
        meses = s1.nextInt();
        Alumno a1 = new Alumno(nombre, meses);
        //Pedir notas
        for(int i = 0; i <a1.getNotas().length;i++){
            System.out.println("Escriba la nota del mes " + (i+1) + " -> ");
            nota = s1.nextInt();
            try {
                a1.asignarNota(nota, (i+1));
            } catch (ExcepcionNotaInvalida e) {
                System.out.println("La nota no es válida");
            } catch (ExcepcionFueraRango e) {
                System.out.println("El mes es no válido");
            }
        }
        filaDeInscripcion.offer(a1);
        System.out.println("---Comprobación---");
        System.out.println(filaDeInscripcion);

    }

    public static void mostrarMenu(){
        System.out.println("---Menu de opciones ---");
        System.out.println("1) Llega un alumno");
        System.out.println("2) Se atiende a un alumno");
        System.out.println("3) Se atiende a todos los alumnos");
        System.out.println("4) Mostrar la fila");
        System.out.println("5) salir");
        System.out.println("Escriba la opción -> ");
    }
}
