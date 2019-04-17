package com.daniel.belmonte.Modulo1Actividad10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 10
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String cantidad = "";
    	String simbolo = "";
    	
    	try {
			do {
				System.out.println("Introduce un entero (altura): ");
				cantidad = reader.readLine();
			}
			while(!cantidad.matches("^[1-9][0-9]*$"));	//Cualquier entero positivo mayor que 0
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	try {
			do {
				System.out.println("Introduce un caracter (relleno): ");
				simbolo = reader.readLine();
			}
			while(!simbolo.matches("^\\S$"));	//Cualquier caracter excepto espacios en blanco
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	dibuja(Integer.valueOf(cantidad), simbolo.charAt(0));
    }
    
    public static void dibuja(int altura, char simbolo) {
    	for(int i = 0; i <= altura; i++) {
    		//Rellenamos con espacios en blanco para formar la pirámide
    		for(int j = 0; j < (altura - i); j++) {
    			System.out.print(" ");
    		}
    		//Dibujamos línea de caracteres
    		for(int k = 0; k < ((2 * i) - 1); k++) {
    			System.out.print(simbolo);
    		}
    		//Cambio de línea
    		System.out.println();
    	}
    }
}
