package com.daniel.belmonte.Modulo1Actividad11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 11
 * 
 * Cree un programa que a partir de n números introducidos nos índique el número de números
 * positivos introducidos y el número de números negativos introducidos
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	ListaNumeros lNum = new ListaNumeros();
    	String leido = "";
    	boolean salir = false;
    	
    	try {
			do {
				System.out.println("Introduce un valor entero, otros valores se ignorarán" +
								   " | Pulsa 's' para salir): ");
				leido = reader.readLine();
				
				//CORREGIR PARA LEER A TRAVES DE LNUM
				//if(leido.matches("^[-]?[1-9][0-9]*$")) lista.add(Integer.valueOf(leido));
				
				if (leido.matches("^[s]$")) salir = true;
			}
			while(!salir);
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    }
}
