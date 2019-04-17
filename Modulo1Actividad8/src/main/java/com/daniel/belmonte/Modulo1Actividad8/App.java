package com.daniel.belmonte.Modulo1Actividad8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 8
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";
    	int valor = 0;
    	
    	try {
			do {
				System.out.println("¿De cuántos valores será la serie de Fibbonacci? -> ");
				leido = reader.readLine();
				
				if(leido.matches("^[1-9][0-9]*$")) {
					valor = Integer.valueOf(leido);
				}
				else
					valor = 0;
			}
			while(!(valor > 1));
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}

    	for(int j = 0; j < valor; j++) {
    		System.out.println(getFibbonacci(j) + " ");
    	}
    }
    
    public static int getFibbonacci(int startPoint) {
    	if(startPoint > 1) {
    		return getFibbonacci(startPoint - 1) + getFibbonacci(startPoint - 2);
    	}
    	else if (startPoint == 1) {
    		return 1;
    	}
    	else if (startPoint == 0) {
    		return 0;
    	}
    	else {
    		System.out.println("ERROR EN LA FUNCIÓN RECURSIVA. VALOR INTRODUCIDO: " + startPoint);
    		return -1;
    	}    	
    }
}
