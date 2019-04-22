package com.daniel.belmonte.Modulo1Actividad14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 14
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array
 * de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual
 * que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior
 * derecha.
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        int cifras[][] = new int[4][5];
        int sumRows[] = {0, 0, 0, 0};
        int sumCols[] = {0, 0, 0, 0, 0};
        int sumTotal = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";        
        
    	for(int i = 0; i < 4; i++) {
    		for(int j = 0; j < 5; j++) {
    			try {
        			do {
        				System.out.println("Introduce un número entero [" + i + ", " + j + "]: ");
           				leido = reader.readLine();	
        			}
        			while(!leido.matches("^[-]?\\d+$"));
            	}catch(Exception ex) {
            		System.out.println(ex);
            	}
    			
    			cifras[i][j] = Integer.valueOf(leido);
    			sumRows[i] += cifras[i][j];
    			sumCols[j] += cifras[i][j];
    			sumTotal += cifras[i][j];
    		}
    	}
    	
    	for(int i = 0; i < 4; i++) {
    		for(int j = 0; j < 5; j++) {
    			System.out.print(cifras[i][j] + "\t");
    		}
    		
    		System.out.println(sumRows[i]);
    	}
    	
    	for(int i = 0; i < 5; i++) {
			System.out.print(sumCols[i] + "\t");
		}
    	
    	System.out.println();
    	System.out.println("\t\t\t\t\t" + sumTotal);
    }
}
