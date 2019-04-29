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
		this.degree = poly.degree;
		this.coeff = new int[poly.coeff.length];
		for(int i = 0; i < poly.coeff.length; i++) {
			this.coeff[i] = poly.coeff[i];
		}
	}
	
	public Polynomial(String poly) {
		//Crea un polinomio basado en una especificación String
		int index1 = poly.indexOf("^");
		int index2 = poly.indexOf("x");
		
		//Determinamos el grado del polinomio
		if(index1 != -1) {
			degree = Integer.valueOf(String.valueOf(poly.charAt(index1 + 1)));
		}
		else {
			if(index2 != -1) {
				degree = 1;
			}
			else {
				degree = 0;
			}
		}
		
		//Reservamos memoria para el array de coeficientes
		this.coeff = new int[degree + 1];
		
		
		
//		String[] splitPoly = poly.split("[+-]");
//		System.out.println(splitPoly);
//		System.out.println("Length: " + splitPoly.length);
//		for(int i = 0; i < splitPoly.length; i++) {
//			System.out.println(splitPoly[i]);
//		}
		/***********************/
//		int index1 = poly.indexOf("^");
//		int index2 = poly.indexOf("x");
//		
//		if(index1 != -1) {
//			degree = Integer.valueOf(String.valueOf(poly.charAt(index1 + 1)));	//El grado está tras el primer caracter ^
//			this.coeff = new int[degree + 1];
//			for(int i = 0; i < (degree + 1); i++) {
//				if(index2 == -1) {
//					if(poly.charAt(degree) == 'x') {
//						this.coeff[i] = 0;
//					}
//					else {
//						this.coeff[i] = Integer.valueOf(String.valueOf(poly.charAt(poly.length() - 1)));
//					}
//				}
//				else {
//					try {
//						this.coeff[i] = Integer.valueOf(String.valueOf(poly.charAt(index2 - 1)));
//					}
//					catch(Exception ex) {
//						System.out.println(ex);
//					}
//				}
//				
//				index2 = poly.indexOf("x", index2 + 1);
//			}
//		}
//		else {
//			if(index2 != -1) {
//				degree = 1;	//El grado es 1
//				this.coeff = new int[2];
//				try {
//					if(poly.charAt(0) != '-') {
//						this.coeff[0] = Integer.valueOf(String.valueOf(poly.charAt(0)));
//					}
//					else {
//						this.coeff[0] = Integer.valueOf(String.valueOf(poly.charAt(degree)));
//					}
//					this.coeff[1] = Integer.valueOf(String.valueOf((poly.charAt(poly.length() - 1))));
//				}
//				catch(Exception ex) {
//					System.out.println(ex);
//				}
//			}
//			else {
//				degree = 0;	//El grado es 0
//				this.coeff = new int[1];
//				try {
//					this.coeff[0] = Integer.valueOf(poly);
//				}
//				catch(Exception ex) {
//					System.out.println(ex);
//				}
//			}
//		}
	}
	
	public int getDegree() {
		return degree;
	}
	
	public int[] getCoeff() {
		return coeff;
	}
	
	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	public void setCoeff(int[] coeff) {
		this.coeff = new int[coeff.length];
		for(int i = 0; i < coeff.length; i++) {
			this.coeff[i] = coeff[i];
		}
	}
}
