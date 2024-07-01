package com.corenetworks.presentacion;

import com.corenetwoks.modelo.Fecha;

public class ProbarFecha {
    public static void main(String[] args) {
        Fecha f1 = null;
        try {
            f1 = new Fecha(2024,13,1);
            System.out.println(f1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
