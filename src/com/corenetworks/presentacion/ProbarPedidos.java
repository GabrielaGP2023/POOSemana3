package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Pedido;
import com.corenetwoks.modelo.Pedidos;

import java.util.Scanner;

public class ProbarPedidos {
    private static Scanner s1 = new Scanner(System.in);
    private static Pedidos p1 = new Pedidos();
    public static void main(String[] args) {
        int opcion;
        Pedido p;
        do{
            mostrarMenu();
            opcion = s1.nextInt();
            switch (opcion){
                case 1 -> altaPedido();
                case 2 -> bajaPedido();
                case 3 -> consultarPedido();
                case 4 -> System.out.println(p1.consultarTodosPedidos());
                case 5 -> modificarPedido();
            }
        }while (opcion >=1 && opcion<6);

    }

    private static void modificarPedido() {
        //1. Pedir los datos del Pedido
        int idPedido, idCliente;
        double total, iva;

        System.out.println("Escriba el id Pedido -> ");
        idPedido = s1.nextInt();
        System.out.println("Escribe el id Cliente -> ");
        idCliente = s1.nextInt();
        System.out.println("Escriba el total del pedido ->");
        total = s1.nextDouble();
        System.out.println("Escriba el iva -> ");
        iva = s1.nextDouble();
        //2. Crear un objeto de tipo pedido
        Pedido p = new Pedido(idPedido,idCliente,total,iva);
        //3. Mandar llamar al alta de pedidos
        p1.modificarPedido(p);
        System.out.println(p1);
    }

    public static void mostrarMenu(){
        System.out.println("1. Alta Pedido");
        System.out.println("2. Baja Pedido");
        System.out.println("3. Consulta un Pedido");
        System.out.println("4. Consulta todos los pedidos Pedido");
        System.out.println("5. Modificar Pedido");
        System.out.println("6. Salir");
        System.out.println("Escriba la opcion seleccionada");
    }

    public static void altaPedido(){
        //1. Pedir los datos del Pedido
        int idPedido, idCliente;
        double total, iva;

        System.out.println("Escriba el id Pedido -> ");
        idPedido = s1.nextInt();
        System.out.println("Escribe el id Cliente -> ");
        idCliente = s1.nextInt();
        System.out.println("Escriba el total del pedido ->");
        total = s1.nextDouble();
        System.out.println("Escriba el iva -> ");
        iva = s1.nextDouble();
        //2. Crear un objeto de tipo pedido
        Pedido p = new Pedido(idPedido,idCliente,total,iva);
        //3. Mandar llamar al alta de pedidos
        p1.altaPedido(p);
        System.out.println(p1);

    }

    public static void bajaPedido(){
        //1. Solicitar el id Pedido
        int idPedido;
        System.out.println("Escriba el pedido ->");
        idPedido = s1.nextInt();
        //2. Mandar llamar la baja
        p1.bajaPedido(idPedido);
        System.out.println(p1);

    }

    public static void consultarPedido(){
        //1. Solicitar Pedidio
        //2. Mandar llamar la consulta
        int idPedido;
        System.out.println("Escriba el pedido ->");
        idPedido = s1.nextInt();
        System.out.println(p1.consultarUnPedido(idPedido));
    }
}
