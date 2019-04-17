package com.daniel.belmonte.Modulo1Actividad9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * MÓDULO 1 - ACTIVIDAD 9
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String numero = "";
    	DecimalFormat df = new DecimalFormat("#.000");
    	double base = 0.0;
    	double exponente = 0.0;
    	
    	try {
			do {
				System.out.println("Introduce un número (base): ");
				numero = reader.readLine();
			}
			while(!numero.matches("^[-]?[0-9]+((\\.)\\d{0,10})?$"));
			
			base = Double.parseDouble(numero);
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	
    	try {
			do {
				System.out.println("Introduce otro número (exponente): ");
				numero = reader.readLine();
			}
			while(!numero.matches("^[-]?[0-9]+((\\.)\\d{0,10})?$"));
			
			exponente = Double.parseDouble(numero);
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	
    	System.out.println(base + " elevado a " + exponente + " da como resultado " +
    					   df.format(Math.pow(base, exponente)));
    }
}
