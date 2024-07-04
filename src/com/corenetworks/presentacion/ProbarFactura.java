package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Factura;

import java.util.HashSet;
import java.util.Set;

public class ProbarFactura {
    public static void main(String[] args) {
        Set s1 = new HashSet();

        Factura f1 = new Factura(1,3);

        Factura f2 = new Factura();

        try {
            f1.comprobarFactura();
            f2.comprobarFactura();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
