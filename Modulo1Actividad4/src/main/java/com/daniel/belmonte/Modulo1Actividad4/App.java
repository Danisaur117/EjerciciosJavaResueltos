package com.daniel.belmonte.Modulo1Actividad4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 4
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String cantidad = "";
    	
    	try {
			do {
				System.out.println("Introduce la cantidad de KB: ");
				cantidad = reader.readLine();
			}
			while(!cantidad.matches("^[1-9][0-9]*$"));
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	System.out.println(cantidad + " KB son " + (Integer.parseInt(cantidad) * 1024) + " MB");
    }
}
