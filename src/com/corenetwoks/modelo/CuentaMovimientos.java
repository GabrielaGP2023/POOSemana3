package com.corenetwoks.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;



public class CuentaMovimientos extends CuentaLimite{
	/*ADMIN dice:Clase CuentaMovimientos
	Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
	que devolverá un ArraList con los movimientos realizados en la cuenta
	Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción) */
	    private int ultimoMovimiento;
	    private Movimientos[] movimientos= new Movimientos[10];
	    
	    public CuentaMovimientos(double saldo, double limite) {
	    	super(saldo,limite);
	    }

	   
	    public  Movimientos[] obtenerMovimientos() {
	        //Devuelve la lista de movimientos
	        return movimientos;
	    }
        
	    
		@Override
		public void extraer(double cantidad) throws Exception {
			//Cuando se crea el objeto de movimiento de una extracción
			Movimientos m=new Movimientos(cantidad,LocalDateTime.now(),"Extracción"); 
			 //Agregamos objeto de movimiento creado a la lista de movimientos
	        movimientos[ultimoMovimiento++]= m;
	        //Llamamos al método extraer de la clase padre con el parámetro cantidad
	        super.extraer(cantidad);
		}

		@Override
		public void ingresar(double cantidad) {
			//Cuando se crea el objeto de movimiento de un ingreso
			Movimientos m=new Movimientos(cantidad,LocalDateTime.now(),"Ingreso");
			//Agregamos objeto de movimiento creado a la lista de movimientos
			movimientos[ultimoMovimiento++]= m;
			//Llamamos al método extraer de la clase padre con el parámetro cantidad
			super.ingresar(cantidad);
		}
		
	    
	}



