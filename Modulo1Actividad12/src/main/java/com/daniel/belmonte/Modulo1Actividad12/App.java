package com.daniel.belmonte.Modulo1Actividad12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 12
 * 
 * Cree un programa que invierta el número que se pide el usuario. Por ejemplo, si el usuario
 * introduce 4561 el programa debe devolver 1654
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String leido = "";
    	
    	try {
			do {
				System.out.println("Introduce un número: ");
				leido = reader.readLine();
			}
			while(!leido.matches("[0-9]+((\\.)\\d{0,10})?$"));
    	}catch(Exception ex) {
    		System.out.println(ex);
    	}
    	
    	System.out.println(leido);
    	System.out.println(leido.length());
    	
    	for(int i = (leido.length() - 1); i >= 0 ; i--) {
    		System.out.print(leido.charAt(i));
    	}
    }
}
