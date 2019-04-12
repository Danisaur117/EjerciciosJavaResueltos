package com.daniel.belmonte.Modulo1Actividad2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 1 - ACTIVIDAD 2
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
    	
    	System.out.println("RomanNumerals of year " + year + " is " + toRomanNumerals(year));
    }
    
    public static String toRomanNumerals(String year) {
    	int input = Integer.parseInt(year);
    	String result = "";
    	
    	//Algorithm by Michael Currie:
    	//https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java
    	if(input < 1 || input > 3999) return "Invalid Roman Number Value";

    	while (input >= 1000) {
    		result += "M";
    		input -= 1000;        
    	}

    	while (input >= 900) {
    		result += "CM";
    		input -= 900;
    	}
    	
    	while (input >= 500) {
    		result += "D";
    		input -= 500;
    	}
    	
    	while (input >= 400) {
    		result += "CD";
    		input -= 400;
    	}
    	
    	while (input >= 100) {
    		result += "C";
    		input -= 100;
    	}
    	
    	while (input >= 90) {
    		result += "XC";
    		input -= 90;
    	}
    	
    	while (input >= 50) {
    		result += "L";
    		input -= 50;
    	}
    	
    	while (input >= 40) {
    		result += "XL";
    		input -= 40;
    	}
    	
    	while (input >= 10) {
    		result += "X";
    		input -= 10;
    	}
    	
    	while (input >= 9) {
    		result += "IX";
    		input -= 9;
    	}
    	
    	while (input >= 5) {
    		result += "V";
    		input -= 5;
    	}
    	
    	while (input >= 4) {
    		result += "IV";
    		input -= 4;
    	}
    	
    	while (input >= 1) {
    		result += "I";
    		input -= 1;
    	}    

    	return result;
    }
}
