package com.daniel.belmonte.Modulo1Actividad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String year = "";
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    	System.out.println("Year? ");

    	try {
    		year = reader.readLine();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}

    	if(isLeap(year)) {
    		System.out.println("Year " + year + " IS leap");
    	}
    	else {
    		System.out.println("Year " + year + " ISN'T leap");
    	}
    }
    
    public static boolean isLeap(String year) {
    	if(Integer.parseInt(year) % 4 == 0) return true;
    	
    	return false;
    }
}
