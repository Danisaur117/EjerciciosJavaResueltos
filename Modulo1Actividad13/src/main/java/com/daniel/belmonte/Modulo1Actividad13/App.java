package com.daniel.belmonte.Modulo1Actividad13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 13
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
 * partidos y el pleno al quince (15 filas)
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	Pronostico[] quiniela = new Pronostico[15];
    	String leido = "";
    	
    	for(int i = 0; i < 15; i++) {
    		try {
   				System.out.println("Introduce el partido " + (i + 1));
   				leido = reader.readLine();
        	}catch(Exception ex) {
        		System.out.println(ex);
        	}
    		
    		quiniela[i].setPartido(leido);
    		
    		for(int j = 0; j < 3; j++) {
    			try {
       				System.out.println("Introduce el pronóstico " + (j + 1));
       				leido = reader.readLine();
            	}catch(Exception ex) {
            		System.out.println(ex);
            	}
    			
    			quiniela[i].setPronostico(j, leido);
    		}
    	}
    	
    	for(int k = 0; k < 15; k++) {
    		System.out.println("Partido " + k + " - " + quiniela[k].getPartido() + ": " +
    						   quiniela[k].getPronostico(0) + " - " + quiniela[k].getPronostico(1) +
    						   quiniela[k].getPronostico(2));
    	}
    }
}
