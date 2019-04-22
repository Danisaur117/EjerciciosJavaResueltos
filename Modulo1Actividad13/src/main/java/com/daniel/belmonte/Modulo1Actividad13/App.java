package com.daniel.belmonte.Modulo1Actividad13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

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
    	final int PARTIDOS = 15;
    	
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";
    	ArrayList<Pronostico> quiniela = new ArrayList<Pronostico>();
    	
    	for(int i = 0; i < PARTIDOS; i++) {
    		Pronostico pronostico = new Pronostico();
    		
    		try {
    			do {
    				System.out.println("Introduce el partido " + (i + 1));
       				leido = reader.readLine();	
    			}
    			while(!leido.matches("^[\\S]+.*$"));
        	}catch(Exception ex) {
        		System.out.println(ex);
        	}
    		
    		pronostico.setPartido(leido);
    		
    		for(int j = 0; j < 3; j++) {
    			try {
        			do {
	       				System.out.println("Introduce el pronóstico " + (j + 1));
	       				leido = reader.readLine();
        			}
       				while(!leido.matches("^[1X2]+$"));
            	}catch(Exception ex) {
            		System.out.println(ex);
            	}
    			
    			pronostico.setPronostico(j, leido);
    		}
    		
//    		System.out.println("Añadiendo el partido (" + i + "): " + pronostico.getPartido());
//    		System.out.println(" -> Pronósticos: " + pronostico.getPronostico(0) +
//    										 " - " + pronostico.getPronostico(1) +
//    										 " - " + pronostico.getPronostico(2));
    		quiniela.add(i, pronostico);
//    		System.out.println("Hay " + quiniela.size() + " partidos");
    	}
    	
    	System.out.println("Hay " + quiniela.size() + " partidos en total");
    	
    	Iterator<Pronostico> iter = quiniela.iterator();
    	
    	while(iter.hasNext()) {
    		Pronostico pronostico = new Pronostico();
    		pronostico = iter.next();
    		System.out.println("-> " + pronostico.getPartido() + ": " +
    						   pronostico.getPronostico(0) + " - " + pronostico.getPronostico(1) +
    						   " - " + pronostico.getPronostico(2));
    	}
    }
}
