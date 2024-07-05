package com.corenetwoks.modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AccesoCategorias extends Conexion {
	
	public List<Categoria> obtenerTodas() throws ClassNotFoundException, Exception{
		//1. Declarar variables
		List<Categoria> resultado = new ArrayList<>();
		Statement st;
		ResultSet rs;
		String sql = "select category_id,category_name,description from categories;";
		//2. Abrir la conexion
		abrirConexion();
		//3. Recoger el statement de la conexion
		st = miConexion.createStatement();
		//4. Ejecutar el statement 
		rs = st.executeQuery(sql);
		//5. Recorrer el ResultSet
		while (rs.next()) {
//			int id = rs.getInt(1);
//			String nombre = rs.getString(2);
//			String descripcion = rs.getString(3);
//			Categoria c1 = new Categoria(id, nombre, descripcion);
//			resultado.add(c1);
			resultado.add(new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3)));		
		}
		//6. Cerrar todo
		rs.close();
		st.close();
		miConexion.close();
		//7. Devolver la coleccion
		return resultado;
	}
	
	public Categoria obtenerUna(int id) throws ClassNotFoundException, Exception{
		//1. Declarar variables
		Categoria resultado= null;
		Statement st;
		ResultSet rs;
		String sql = "select [CategoryID],[CategoryName],[Description] from Categories where CategoryId ="+id+ ";";
		//2. Abrir la conexion
		abrirConexion();
		//3. Recoger el statement de la conexion
		st = miConexion.createStatement();
		//4. Ejecutar el statement 
		rs = st.executeQuery(sql);
		//5. Recorrer el ResultSet
		if (rs.next()) {
//			int id = rs.getInt(1);
//			String nombre = rs.getString(2);
//			String descripcion = rs.getString(3);
//			Categoria c1 = new Categoria(id, nombre, descripcion);
//			resultado.add(c1);
			resultado= new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3));		
		}
		//6. Cerrar todo
		rs.close();
		st.close();
		miConexion.close();
		//7. Devolver la coleccion
		return resultado;
	}
//	public boolean insertar(Categoria c) throws ClassNotFoundException, Exception{
//		//1. Declarar variables
//		int resultado= 0;
//		Statement st;
//
//		String sql = "Insert into Categories (CategoryName, Description) values ('" + c.getNombre() + "', '" + c.getDescripcion() + "');";
//		//2. Abrir la conexion
//		abrirConexion();
//		//3. Recoger el statement de la conexion
//		st = miConexion.createStatement();
//		//4. Ejecutar el statement
//		resultado = st.executeUpdate(sql);
//		//6. Cerrar todo
//		st.close();
//		miConexion.close();
//		//7. Devolver la coleccion
//		return resultado>0;
//	}
//	public boolean modificar(Categoria c) throws ClassNotFoundException, Exception{
//		//1. Declarar variables
//		int resultado= 0;
//		Statement st;
//
//		String sql = "update Categories set CategoryName='" + c.getNombre() + "' where Categoryid = " + c.getId() +";";
//		//2. Abrir la conexion
//		abrirConexion();
//		//3. Recoger el statement de la conexion
//		st = miConexion.createStatement();
//		//4. Ejecutar el statement
//		resultado = st.executeUpdate(sql);
//		//6. Cerrar todo
//		st.close();
//		miConexion.close();
//		//7. Devolver la coleccion
//		return resultado>0;
//	}
//	public boolean eliminar(int id) throws ClassNotFoundException, Exception{
//		//1. Declarar variables
//		int resultado= 0;
//		Statement st;
//
//		String sql = "delete  Categories where Categoryid = " + id +";";
//		//2. Abrir la conexion
//		abrirConexion();
//		//3. Recoger el statement de la conexion
//		st = miConexion.createStatement();
//		//4. Ejecutar el statement
//		resultado = st.executeUpdate(sql);
//		//6. Cerrar todo
//		st.close();
//		miConexion.close();
//		//7. Devolver la coleccion
//		return resultado>0;
//	}

}
