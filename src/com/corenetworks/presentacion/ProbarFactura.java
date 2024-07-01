package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Factura;

public class ProbarFactura {
    public static void main(String[] args) {
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
