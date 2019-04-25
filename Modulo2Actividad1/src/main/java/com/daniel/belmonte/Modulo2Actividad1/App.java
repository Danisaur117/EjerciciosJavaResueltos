package com.daniel.belmonte.Modulo2Actividad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 2 - ACTIVIDAD 1
 * 
 * Crea un BinaryArray, este BinaryArray es la representación privada de una matriz de variables
 * booleanas. Por ejemplo la representación del BinaryArray "FTTF" sería una matriz de longitud
 * cuatro que almacenaría (false, true, true, false) en los índices 0, 1, 2 y 3 de la matriz,
 * respectivamente. La clase BinaryArray tiene la sisguiente funcionalidad:
 * 		- Un constructor de un único parámetro que contiene un objeto String
 * 		- Métodos accesorios get/set para acceder a una variable en un índice concreto o modificarla
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";
    	String cadena = "";
    	String pos = "";
    	BinaryArray bArray = null;
    	
    	try {
    		do {
    			cadena = "";
	    		showMenu();
	    		leido = reader.readLine();

	    		switch(leido.charAt(0)) {
	    			case '1':{
	    				System.out.println("Introduce una cadena con valores F y T:");
	    				cadena = reader.readLine();
	    				
	    				bArray = new BinaryArray(cadena);
	    				System.out.println("Se ha almacenado la cadena correctamente");
	    				
	    				for(int i = 0; i < bArray.getArr().length; i++) {
	    					System.out.print(bArray.getValue(i).toString() + " ");
	    				}
	    				
	    				break;
	    			}
	    			case '2':{
	    				if(bArray == null) {
	    					System.out.println("Aún no has introducido ninguna matriz");
		    				break;
	    				}
		    			
	    				System.out.println("La matriz que hay almacenada es la siguiente:");
	    				for(int i = 0; i < bArray.getArr().length; i++) {
		    				System.out.print(bArray.getValue(i).toString() + " ");
		    			}

	    				break;
	    			}
	    			case '3':{
	    				if(bArray == null) {
	    					System.out.println("Aún no has introducido ninguna matriz");
		    				break;
	    				}
	    				
	    				do {
	    					System.out.println("Introduce un valor (F ó T):");
		    				cadena = reader.readLine();
	    				}
	    				while(!cadena.matches("^[FT]$"));
	    				
	    				do {
	    					System.out.println("Introduce la posición (de 1 a " +
	    										(bArray.getArr().length) + "):");
		    				pos = reader.readLine();
	    				}
	    				while(!pos.matches("^[1-9]+$"));
	    				
	    				if(bArray.setValueChar(cadena.charAt(0), Integer.valueOf(pos))) {
	    					System.out.println("Valor modificado correctamente");
	    				}
	    				else {
	    					System.out.println("La posición indicada no es válida");
	    				}
	    				
	    				for(int i = 0; i < bArray.getArr().length; i++) {
	    					System.out.print(bArray.getValue(i).toString() + " ");
	    				}
	    				
	    				break;
	    			}
	    			case '4':{
	    				if(bArray == null) {
	    					System.out.println("Aún no has introducido ninguna matriz");	    				
		    				break;
	    				}
	    				
	    				do {
	    					System.out.println("Introduce la posición (de 1 a " +
	    										(bArray.getArr().length) + "):");
		    				pos = reader.readLine();
	    				}
	    				while(!pos.matches("^[1-9]+$"));
	    				
	    				if(bArray.getValue(Integer.valueOf(pos)) == null) {
	    					System.out.println("La posición indicada no es válida");
	    					break;
	    				}
	    				
	    				System.out.println("La posición " + pos + " contiene el valor " +
	    									bArray.getValue(Integer.valueOf(pos)));
	    				
	    				break;
	    			}
	    			case '5':{
	    				System.out.println("GRACIAS POR USAR BINARYARRAY. SALIENDO DEL PROGRAMA...");
	    				break;
	    			}
	    			default:{
	    				System.out.println("ERROR INESPERADO");
	    				break;
	    			}
	    		}
	    		
	    		System.out.println();
	    		System.out.println("Pulsa [INTRO] para continuar");
				cadena = reader.readLine();
    		}
    		while(!leido.matches("^[5]$")); //Mostramos el menú mientras no se pulse el 5 
    	}
    	catch(Exception ex) {
    		System.out.println(ex);
    	}
    }
    
    public static void showMenu() {
    	System.out.println("**************************");
    	System.out.println("*** BINARYARRAY - MENU ***");
    	System.out.println("**************************");
    	System.out.println();
    	System.out.println("-> ¿QUÉ DESEAS HACER?");
    	System.out.println();
    	System.out.println("1.- Establecer matriz");
    	System.out.println("2.- Mostrar matriz");
    	System.out.println("3.- Establecer valor en posición");
    	System.out.println("4.- Mostrar valor de posición");
    	System.out.println("5.- Salir");
    	System.out.println();
    }
}
