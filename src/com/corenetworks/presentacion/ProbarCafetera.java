package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Cafetera;

public class ProbarCafetera {
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        System.out.println(c1.toString());
        c1.llenarCafetera();
        System.out.println(c1.toString());
        c1.servirTaza(250);
        System.out.println(c1.toString());
        c1.servirTaza(300);
        System.out.println(c1.toString());
        c1.agregarCafe(600);
        System.out.println(c1.toString());
        c1.servirTaza(1000);
        System.out.println(c1.toString());
    }
}
