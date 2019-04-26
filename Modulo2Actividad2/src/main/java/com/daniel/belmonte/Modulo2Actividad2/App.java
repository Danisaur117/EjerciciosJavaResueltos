package com.daniel.belmonte.Modulo2Actividad2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MÓDULO 2 - ACTIVIDAD 2
 * 
 * Cree una clase Cuenta que almacena el saldo actual y proporcione los métodos:
 *  - getBalance: para obtener el saldo
 *  - deposit: para depositar fondos
 *  - withdraw: para reitrar fondos
 *  - toString para devolver por pantalla el saldo actual
 *  - Al menos un constructor
 */
public class App 
{
    public static void main( String[] args )
    {
    	String leido = new String();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	Cuenta account = new Cuenta();
    	
    	try {
    		do {
    			leido = "";
    			showMenu();
    			leido = reader.readLine();
    			
    			if(leido.length() == 0) {
    				leido = "5";	//ERROR: NO SE HA PULSADO NINGUNA OPCIÓN
    			}
    			
    			switch(leido.charAt(0)) {
    				case '1':{
    					showSaldo(account);
    					break;
    				}
    				case '2':{
    					opAccount(account, reader, "+");
    					break;
    				}
    				case '3':{
    					opAccount(account, reader, "-");
    					break;
    				}
    				case '4':{
    					System.out.println("GRACIAS POR USAR GEEKSHUBS BANK");
    		    		System.out.println();
    		    		System.out.println("Pulsa [INTRO] para continuar");
	    				break;
    				}
    				default:{
	    				System.out.println("OPCIÓN NO VÁLIDA");
	    				System.out.println();
    		    		System.out.println("Pulsa [INTRO] para continuar");
	    				break;
	    			}
    			}
    			
    			String cadena = reader.readLine();
    		}
    		while(!leido.matches("^[4]$"));	//Mostramos el menú mientras no se pulse el 4
    	}
    	catch(Exception ex) {
    		System.out.println(ex);
    	}
    }
    
    public static void showMenu() {
    	System.out.println("**********************");
    	System.out.println("*** GEEKSHUBS BANK ***");
    	System.out.println("**********************");
    	System.out.println();
    	System.out.println("-> ¿QUÉ DESEAS HACER?");
    	System.out.println();
    	System.out.println("1.- Consultar el saldo");
    	System.out.println("2.- Ingresar dinero");
    	System.out.println("3.- Retirar dinero");
    	System.out.println("4.- Salir");
    	System.out.println();
    }
    
    public static void showSaldo(Cuenta account) {
    	System.out.println("**********************");
    	System.out.println("*** GEEKSHUBS BANK ***");
    	System.out.println("**********************");
    	System.out.println();
    	System.out.println("En la cuenta tienes " + account.toString() + " euros");
    	System.out.println();
    	System.out.println("Pulsa [INTRO] para continuar");
    }
    
    public static void opAccount(Cuenta account, BufferedReader reader, String op) {
    	String amount = new String();
    	double money;
    	
    	System.out.println("**********************");
    	System.out.println("*** GEEKSHUBS BANK ***");
    	System.out.println("**********************");
    	System.out.println();

    	do {
    		if(op == "+") {
    			System.out.print("¿Cuánto dinero deseas ingresar? ");    			
    		}

    		if(op == "-") {
    			System.out.print("¿Cuánto dinero deseas retirar? ");    			
    		}
    		
    		try {
        		amount = reader.readLine();
        	}
        	catch(Exception ex) {
        		System.out.println(ex);
        	}
    	}
    	while(!amount.matches("^[0-9]*((\\.)\\d{0,2})?$"));
    	
    	money = Double.valueOf(amount);
    	
    	if(op == "+") {
    		account.deposit(money);
        	System.out.println("Dinero ingresado correctamente. Tu saldo actual es " +
        					   account.toString() + " euros");    			
		}
    	
    	if(op == "-") {
    		if(account.getBalance() < money) {
    			System.out.println("No te queda suficiente saldo en la cuenta");
    		}
    		else {
    			account.withdraw(money);
            	System.out.println("Dinero retirado correctamente. Tu saldo actual es " +
            					   account.toString() + " euros");
    		}    			
		}
    	
    	System.out.println();
    	System.out.println("Pulsa [INTRO] para continuar");
    }
}
