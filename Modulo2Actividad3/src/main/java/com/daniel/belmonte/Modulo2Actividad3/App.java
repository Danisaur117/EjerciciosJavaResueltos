package com.daniel.belmonte.Modulo2Actividad3;

/**
 * MÓDULO 2 - ACTIVIDAD 3
 * 
 * Implemente una clase, Polynomial, para representar polinomios de una sola variable y escriba un
 * programa de pruebas. La funcionlidad de la clsase Polynomial es la siguiente:
 *  [x] Proporciona al mentos 3 constructores: un constructor de cero parámetros que hace que el
 *    polinomio sea cero, un constructor que crea una copia independiente separada de un polinomio
 *    existente y un constructor que crea un polinomio basado en una especificación String
 *  [x] Crea el metodo negate que devuelve el negado del polinomio que se proporciona como parámetro
 *  [x] Crea los métodos add, substract y multiply que devuelven un nuevo poliniomio que es igual a
 *    la suma, diferencia o producto, respectivamente, de este polinomio y de otro polinomio, rhs.
 *    Ninguno de estos métodos modifican ninguno de los polinimios originales
 *  - equals y toString, el primero comprueba que el polinomio pasado por parámetro es el creado y
 *    toString hace que la representación en forma de cadena de caracteres tenga el mejor formato
 *    posible
 *  [x] El polinomio está representado por dos campos, de tal manera que el primer campo, degree,
 *    representa el grado: x^2+2x+1 es de grado 2, 3x+5 es de grado 1 y 4 es de grado 0 y cero es
 *    automáticamente el grado 0; y el segundo campo, coeff, representa los coeficientes en formato
 *    array (coeff[i] respresenta el coeficiente de x^i, y así sucesivamente)
 */
public class App 
{
    public static void main( String[] args )
    {
//        Polynomial poly = new Polynomial();
//        int[] coeff;
//        System.out.println("Polinomio creado por constructor por defecto: ");
//        System.out.println(" -> Grado: " + poly.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        coeff = poly.getCoeff();
//        for(int i = 0; i < coeff.length; i++) {
//        	System.out.print(coeff[i] + " ");
//        }
//        System.out.println();
//        
//        int[] newCoeff = {1, 3, 8, 0, 1, -4};
//        poly.setDegree(newCoeff.length - 1);
//        poly.setCoeff(newCoeff);
//        Polynomial poly2 = new Polynomial(poly);
//        System.out.println("Polinomio creado por constructor de copia: ");
//        System.out.println(" -> Grado: " + poly2.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        coeff = poly2.getCoeff();
//        for(int i = 0; i < coeff.length; i++) {
//        	System.out.print(coeff[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
        
//        String strPoly = "-x^3+4x^2-3x+1";
//        String strPoly = "-x^3+4x^2-3x+1";
//        String strPoly = "-4x^2-3x+1";
//        String strPoly = "4x^2-3x+1";
//        String strPoly = "-3x+1";
//        String strPoly = "3x+1";
//        String strPoly = "-1";
//        String strPoly = "3";
//        String strPoly = "0";
//        Polynomial poly3 = new Polynomial(strPoly);
//        System.out.println("Polinomio creado por constructor a partir de String: " + strPoly);
//        System.out.println(" -> Grado: " + poly3.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        coeff = poly3.getCoeff();
//        for(int i = 0; i < coeff.length; i++) {
//        	System.out.print(coeff[i] + " ");
//        }
//        System.out.println();
        
//        Polynomial poly3 = new Polynomial();
//        int[] newCoeff2 = {-1, 2, 4, -3, 0};
//        poly3.setCoeff(newCoeff2);
//        poly3.setDegree(newCoeff2.length - 1);
//        System.out.println("Polinomio original: ");
//        System.out.println(" -> Grado: " + poly3.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        coeff = poly3.getCoeff();
//        for(int i = 0; i < coeff.length; i++) {
//        	System.out.print(coeff[i] + " ");
//        }
//        System.out.println();
//        
//        Polynomial poly4 = poly3.negate(poly3);
//        System.out.println("Polinomio negado: ");
//        System.out.println(" -> Grado: " + poly4.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        coeff = poly4.getCoeff();
//        for(int i = 0; i < coeff.length; i++) {
//        	System.out.print(coeff[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
     
////        
//        Polynomial poly6 = new Polynomial();
//        int[] newCoeff6 = {-1, 2, 4, -3, 0};
//        poly6.setCoeff(newCoeff6);
//        poly6.setDegree(newCoeff6.length - 1);
//        Polynomial poly7 = new Polynomial();
//        int[] newCoeff7 = {4, 0, -1, -3, 8};
//        poly7.setCoeff(newCoeff7);
//        poly7.setDegree(newCoeff7.length - 1);
//        Polynomial poly8 = poly7.substract(poly6);
//        System.out.println("Polinomio resta: ");
//        System.out.println(" -> Grado: " + poly8.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        coeff = poly8.getCoeff();
//        for(int i = 0; i < coeff.length; i++) {
//        	System.out.print(coeff[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
//        
//        Polynomial poly1 = new Polynomial();
//        int[] coeff1 = {-1, 2, 4, -3, 0};
//        poly1.setCoeff(coeff1);
//        poly1.setDegree(coeff1.length - 1);
//        
//        Polynomial poly2 = new Polynomial();
//        int[] coeff2 = {4, 0, -1, -3};
//        poly2.setCoeff(coeff2);
//        poly2.setDegree(coeff2.length - 1);
//        
//        Polynomial polyRes1 = poly1.add(poly2);
//        System.out.println("Polinomio suma(poly1 + poly2): ");
//        System.out.println(" -> Grado: " + polyRes1.getDegree());
//        System.out.print(" -> Coeficientes: ");
//        int[] coeffRes1 = polyRes1.getCoeff();
//        for(int i = 0; i < coeffRes1.length; i++) {
//        	System.out.print(coeffRes1[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
    	
//    	Polynomial poly1 = new Polynomial();
//    	int[] coeff1 = {1, 0, -2, 4};
//    	poly1.setCoeff(coeff1);
//      poly1.setDegree(coeff1.length - 1);
//      
//      Polynomial poly2 = new Polynomial();
//      int[] coeff2 = {1, 0, -1};
//      poly2.setCoeff(coeff2);
//      poly2.setDegree(coeff2.length - 1);
//      
//      Polynomial polyRes1 = poly1.multiply(poly2);
//      System.out.println("Polinomio multiplicación (poly1 * poly2): ");
//      System.out.println(" -> Grado: " + polyRes1.getDegree());
//      System.out.print(" -> Coeficientes: ");
//      int[] coeffRes1 = polyRes1.getCoeff();
//      for(int i = 0; i < coeffRes1.length; i++) {
//      	System.out.print(coeffRes1[i] + " ");
//      }
//      System.out.println();
//      System.out.println();
    	
//    	Polynomial poly1 = new Polynomial();
//    	int[] coeff1 = {1, 0, -2, 4};
//    	poly1.setCoeff(coeff1);
//    	poly1.setDegree(coeff1.length - 1);
//    	
//    	Polynomial poly2 = new Polynomial(poly1);
//    	
//    	Polynomial poly3 = new Polynomial();
//    	int[] coeff3 = {1, 0, -2, 4};
//    	poly3.setCoeff(coeff3);
//    	poly3.setDegree(coeff3.length - 1);
//    	
//    	Polynomial poly4 = new Polynomial(poly1);
//    	poly4.setDegree(8);
//    	
//    	if(poly1.equals(poly2)) {
//    		System.out.println("poly1 y poly2 son IGUALES");
//    	}
//    	else {
//    		System.out.println("poly1 y poly2 son DISTINTOS");
//    	}
//    	
//    	if(poly1.equals(poly3)) {
//    		System.out.println("poly1 y poly3 son IGUALES");
//    	}
//    	else {
//    		System.out.println("poly1 y poly3 son DISTINTOS");
//    	}
//    	
//    	if(poly1.equals(poly4)) {
//    		System.out.println("poly1 y poly4 son IGUALES");
//    	}
//    	else {
//    		System.out.println("poly1 y poly4 son DISTINTOS");
//    	}
    	
    	Polynomial poly1 = new Polynomial();
    	int[] coeff1 = {1, 0, -2, 4};	//x^3-2x+4
    	poly1.setCoeff(coeff1);
    	poly1.setDegree(coeff1.length - 1);
    	
    	System.out.println("poly1: " + poly1.toString());
    }
}
