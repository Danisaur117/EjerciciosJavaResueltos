package com.daniel.belmonte.Modulo1Actividad7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * MÓDULO 1 - ACTIVIDAD 7
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	boolean salir = false;
    	String leido;
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	DecimalFormat df = new DecimalFormat("#.000");
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	
    	try {
			do {
				System.out.println("Introduce un valor entero, otros valores se ignorarán" +
								   " | Pulsa 's' para salir): ");
				leido = reader.readLine();
				
				if(leido.matches("^[-]?[1-9][0-9]*$")) lista.add(Integer.valueOf(leido));
				
				if (leido.matches("^[s]$")) salir = true;
			}
			while(!salir);
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	System.out.println("Has introducido " + lista.size() + " valores");
    	System.out.println("La media de todos los valores introducidos es " +
    					   df.format(getMedia(lista)));
    }
    
    public static double getMedia(ArrayList<Integer> lista) {
    	double acc = 0.0;
    	int tam = 1;
    	
    	if(lista.size() != 0) tam = lista.size();
    	
    	for(int i = 0; i < lista.size(); i++)
    		acc += lista.get(i).doubleValue();
    		
    	return acc / tam;
    }
}
