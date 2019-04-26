package com.daniel.belmonte.Modulo2Actividad3;

public class Polynomial {
	protected int degree;
	protected int[] coeff;
	
	public Polynomial() {
		degree = 0;
		coeff = new int[1];
		coeff[0] = 0;
	}
	
	public Polynomial(Polynomial poly) {
		//Crea una copia independiente separada de un polinomio existente
	}
	
	public Polynomial(String poly) {
		//Crea un polinomio basado en una especificación String
	}
}
