package com.corenetwoks.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected  Connection miConexion;
    public void abrirConexion() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
        miConexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/northwind3",
                "postgres","postgres");
        System.out.println("La conexion se ha abierto con exito");
    }



}
