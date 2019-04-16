package com.daniel.belmonte.Modulo1Actividad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * MÓDULO 1 - ACTIVIDAD 3
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	ArrayList<String> lista = new ArrayList<String>();
    	String numero = "";
    	
    	for(int i = 0; i < 10; i++) {
    		try {
    			do {
    				System.out.println("[" + i + "] Introduce un número: ");
    				numero = reader.readLine();
    			}
    			while(!numero.matches("^[-]?[0-9]+((\\.)\\d{0,10})?$"));
    			
    			lista.add(numero);
        	}
        	catch(Exception e) {
        		System.out.println(e);
        	}
    	}
    	
//    	System.out.println("Hay " + lista.size() + " elementos numéricos leídos");
    	
    	for(int j = (lista.size() - 1); j >= 0; j--) {
    		System.out.println(lista.get(j));
    	}
    }
}
