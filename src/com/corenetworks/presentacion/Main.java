package com.corenetworks.presentacion;

import com.corenetwoks.modelo.AccesoCategorias;
import com.corenetwoks.modelo.Conexion;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (SQLException e) {
            System.out.println(e.toString());;
        }
        AccesoCategorias ac = new AccesoCategorias();
        try {
            System.out.println(ac.obtenerTodas());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}