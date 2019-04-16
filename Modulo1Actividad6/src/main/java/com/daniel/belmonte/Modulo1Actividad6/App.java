package com.daniel.belmonte.Modulo1Actividad6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * MÓDULO 1 - ACTIVIDAD 6
 *
 */
public class App 
{
	static final double accGravity = 9.80665;
	
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";
    	DecimalFormat df = new DecimalFormat("#.000");
    	double altura;
    	
    	try {
			do {
				System.out.println("Introduce la altura desde la que cae el objeto (metros): ");
				leido = reader.readLine();
			}
			while(!leido.matches("^[1-9][0-9]*((\\.)\\d{0,3})?$"));
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	altura = Double.valueOf(leido);
    	
    	System.out.println("El tiempo que tarda el objeto en llegar al suelo es de " +
    					   df.format(getTime(altura)) + " segundos");
    }
    
    public static double getTime(double altura) {
    	return Math.sqrt((2 * altura) / accGravity);
    }
}
