package com.daniel.belmonte.Modulo1Actividad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * MÓDULO 1 - ACTIVIDAD 3
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	ArrayList<Double> lista = new ArrayList<Double>();
    	String numero = "";
    	
    	for(int i = 0; i < 10; i++) {
    		try {
    			do {
    				System.out.println("[" + i + "] Introduce un número: ");
    				numero = reader.readLine();
    			}
    			while(!numero.matches("^[-]?[0-9]+((\\.)\\d{0,10})?$"));
    			
    			lista.add(Double.valueOf(numero));
        	}
        	catch(Exception e) {
        		System.out.println(e);
        	}
    	}
    	
//    	System.out.println("Hay " + lista.size() + " elementos numéricos leídos");
    	
    	Collections.sort(lista, new Comparator<Double>(){
    		public int compare(Double d1, Double d2) {
    			return d1.compareTo(d2);
    		}
    	});
    	
    	for(int j = 0; j < lista.size(); j++) {
    		System.out.println(lista.get(j).doubleValue());
    	}
    }
}
