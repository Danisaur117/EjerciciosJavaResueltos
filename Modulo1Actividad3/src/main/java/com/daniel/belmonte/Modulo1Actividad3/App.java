package com.daniel.belmonte.Modulo1Actividad3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * MÓDULO 1 - ACTIVIDAD 3
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	ArrayList<String> lista = new ArrayList<String>();
    	
    	for(int i = 0; i < 10; i++) {
    		System.out.println("Number " + i + "? ");
    		
    		try {
    			lista.add(reader.readLine());
        	}
        	catch(Exception e) {
        		System.out.println(e);
        	}
    	}
    	
    	lista.sort(null);
    	
    	for(int j = 0; j < lista.size(); j++) {
    		System.out.println(lista.get(j));
    	}
    }
}
