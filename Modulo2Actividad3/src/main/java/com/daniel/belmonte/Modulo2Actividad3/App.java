package com.daniel.belmonte.Modulo2Actividad3;

/**
 * MÓDULO 2 - ACTIVIDAD 3
 * 
 * Implemente una clase, Polynomial, para representar polinomios de una sola variable y escriba un
 * programa de pruebas. La funcionlidad de la clsase Polynomial es la siguiente:
 *  - Proporciona al mentos 3 constructores: un constructor de cero parámetros que hace que el
 *    polinomio sea cero, un constructor que crea una copia independiente separada de un polinomio
 *    existente y un constructor que crea un polinomio basado en una especificación String
 *  - Crea el metodo negate que devuelve el negado del polinomio que se proporciona como parámetro
 *  - Crea los métodos add, substract y multiply que devuelven un nuevo poliniomio que es igual a
 *    la suma, diferencia o producto, respectivamente, de este polinomio y de otro polinomio, rhs.
 *    Ninguno de estos métodos modifican ninguno de los polinimios originales
 *  - equals y toString, el primero comprueba que el polinomio pasado por parámetro es el creado y
 *    toString hace que la representación en forma de cadena de caracteres tenga el mejor formato
 *    posible
 *  - El polinonio está representado por dos campos, de tal manera que el primer campo, degree,
 *    representa el grado: x^2+2x+1 es de grado 2, 3x+5 es de grado 1 y 4 es de grado 0 y cero es
 *    automáticamente el grado 0; y el segundo campo, coeff, representa los coeficientes en formato
 *    array (coeff[i] respresenta el coeficiente de x^i, y así sucesivamente)
 */
public class App 
{
    public static void main( String[] args )
    {
        Polynomial poly = new Polynomial();
        int[] coeff;
        System.out.println("Polinomio creado por constructor por defecto: ");
        System.out.println(" -> Grado: " + poly.getDegree());
        System.out.print(" -> Coeficientes: ");
        coeff = poly.getCoeff();
        for(int i = 0; i < coeff.length; i++) {
        	System.out.print(coeff[i] + " ");
        }
        System.out.println();
        
        int[] newCoeff = {1, 3, 2, 8, 0, 1, -4};
        poly.setDegree(5);
        poly.setCoeff(newCoeff);
        Polynomial poly2 = new Polynomial(poly);
        System.out.println("Polinomio creado por constructor de copia: ");
        System.out.println(" -> Grado: " + poly2.getDegree());
        System.out.print(" -> Coeficientes: ");
        coeff = poly2.getCoeff();
        for(int i = 0; i < coeff.length; i++) {
        	System.out.print(coeff[i] + " ");
        }
        System.out.println();
        
        String strPoly = "-x^3+4x^2-3x+1";
//        String strPoly = "-x^3+4x^2-3x+1";
//        String strPoly = "-4x^2-3x+1";
//        String strPoly = "4x^2-3x+1";
//        String strPoly = "-3x+1";
//        String strPoly = "3x+1";
//        String strPoly = "-1";
//        String strPoly = "3";
//        String strPoly = "0";
        Polynomial poly3 = new Polynomial(strPoly);
        System.out.println("Polinomio creado por constructor a partir de String: " + strPoly);
        System.out.println(" -> Grado: " + poly3.getDegree());
        System.out.print(" -> Coeficientes: ");
        coeff = poly3.getCoeff();
        for(int i = 0; i < coeff.length; i++) {
        	System.out.print(coeff[i] + " ");
        }
        System.out.println();
    }
}
