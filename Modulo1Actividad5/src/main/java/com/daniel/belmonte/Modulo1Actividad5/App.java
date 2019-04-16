package com.daniel.belmonte.Modulo1Actividad5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * MÓDULO 1 - ACTIVIDAD 5
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";
    	double radio, altura;
    	DecimalFormat df = new DecimalFormat("#.000");
    	
    	try {
			do {
				System.out.println("Introduce el radio de la base (metros): ");
				leido = reader.readLine();
			}
			while(!leido.matches("^[1-9][0-9]*((\\.)\\d{0,3})?$"));
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	radio = Double.valueOf(leido);
    	
    	try {
			do {
				System.out.println("Introduce la altura (metros): ");
				leido = reader.readLine();
			}
			while(!leido.matches("^[1-9][0-9]*((\\.)\\d{0,3})?$"));
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	altura = Double.valueOf(leido);
    	
    	System.out.println("La altura del cono es " + df.format(getVolumen(radio, altura)) +
    					   " metros cúbicos");
    }
    
    public static double getVolumen(double base, double altura) {    	
    	return (Math.PI * base * base * altura) / 3;
    }
}
