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
	
	/* CONSTRUCTOR PENDIENTE DE IMPLEMENTAR */
	@Deprecated
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
		
		//Identificamos los coeficientes del polinomio
		if(degree == 0) {
			this.coeff[0] = 0;
		}
		else {
			index2 = -1;
			for(int i = 0; i < (degree + 1); i++) {
				index2 = poly.indexOf("x", index2 + 1);

				if(index2 == 0) {
					this.coeff[i] = 1;
				}
				else {
					if(poly.charAt(index2 - 1) == '-') {
						this.coeff[i] = -this.coeff[i]; 
					}
				}
			}
		}
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
	
	public Polynomial negate(Polynomial poly) {
		Polynomial negPoly = new Polynomial(poly);
		int[] negCoeff = negPoly.getCoeff();
		
		//Recorremos los coeficientes cambiándoles el signo
		for(int i = 0; i < negCoeff.length; i++) {
			negCoeff[i] = -negCoeff[i]; 
		}
		
		//Guardamos los coeficientes negados en el polinomio resultado
		negPoly.setCoeff(negCoeff);
		
		return negPoly;
	}
	
	public Polynomial add(Polynomial poly) {
		Polynomial resPoly;
		int maxDegree = Math.max(this.degree, poly.getDegree());
		int[] resCoeff;
		
		//Si ambos polinomios tienen el mismo grado, sumamos uno a uno los coeficientes. Si no,
		//deberemos determinar cuál de los 2 es el polinomio de mayor grado para utilizarlo como
		//referencia, y deberemos empezar a sumar por la posición resultante de la diferencia de
		//grados para que la suma de coeficientes sea correcta
		if(this.degree == poly.getDegree()) {
			resPoly = new Polynomial(this);
			resCoeff = this.coeff;
			int[] polyCoeff = poly.getCoeff();
				
			for(int i = 0; i <= maxDegree; i++) {
				resCoeff[i] += polyCoeff[i];
			}
		}
		else {
			if(maxDegree == this.degree) {
				resPoly = new Polynomial(this);
				resCoeff = this.coeff;
				int[] polyCoeff = poly.getCoeff();
				
				for(int i = (maxDegree - poly.getDegree()); i <= maxDegree; i++) {
					resCoeff[i] += polyCoeff[i - 1];
				}
			}
			else {
				resPoly = new Polynomial(poly);
				resCoeff = poly.getCoeff();
				
				for(int i = (maxDegree - this.degree); i <= maxDegree; i++) {
					resCoeff[i] += this.coeff[i - 1];
				}
			}
		}
				
		//Almacenaremos y devolveremos en resPoly el objeto Polynomial resultado de la suma
		resPoly.setCoeff(resCoeff);
		resPoly.setDegree(resCoeff.length - 1);
		
		return resPoly;
	}
	
	public Polynomial substract(Polynomial poly) {
		Polynomial resPoly;
		int maxDegree = Math.max(this.degree, poly.getDegree());
		int[] resCoeff;
		
		//Si ambos polinomios tienen el mismo grado, restamos uno a uno los coeficientes. Si no,
		//deberemos determinar cuál de los 2 es el polinomio de mayor grado para utilizarlo como
		//referencia sin variar el orden de los operadores. Además, deberemos empezar a restar por
		//la posición resultante de la diferencia de grados para que la resta de coeficientes sea
		//correcta
		if(this.degree == poly.getDegree()) {
			resPoly = new Polynomial(this);
			resCoeff = this.coeff;
			int[] polyCoeff = poly.getCoeff();
				
			for(int i = 0; i <= maxDegree; i++) {
				resCoeff[i] -= polyCoeff[i];
			}
		}
		else {	
			if(maxDegree == this.degree) {
				resPoly = new Polynomial(this);
				resCoeff = this.coeff;
				int[] polyCoeff = poly.getCoeff();
				
				for(int i = (maxDegree - poly.getDegree()); i <= maxDegree; i++) {
					resCoeff[i] -= polyCoeff[i - 1];
				}
			}
			else {
				resPoly = poly.negate(poly);
				resCoeff = resPoly.getCoeff();
					
				for(int i = (maxDegree - this.degree); i <= maxDegree; i++) {
					resCoeff[i] += this.coeff[i - 1];
				}
			}
		}
		
		//Almacenaremos y devolveremos en resPoly el objeto Polynomial resultado de la resta
		resPoly.setCoeff(resCoeff);
		resPoly.setDegree(resCoeff.length - 1);
		
		return resPoly;
	}
	
	public Polynomial multiply(Polynomial poly) {
		int[] polyCoeff = poly.getCoeff();
		Polynomial resPoly = new Polynomial();
		int degree = this.degree + poly.getDegree();
		int[] resCoeff = new int[degree + 1];
		
		for(int i = 0; i <= this.degree ; i++) {
			for(int j = 0; j <= poly.getDegree() ; j++) {
				resCoeff[i + j] += this.coeff[i] * polyCoeff[j]; 
			}
		}
		
		//Almacenaremos y devolveremos en resPoly el objeto Polynomial resultado de la resta
		resPoly.setCoeff(resCoeff);
		resPoly.setDegree(resCoeff.length - 1);

		return resPoly;
	}
	
	public boolean equals(Polynomial poly) {
		if(this.degree != poly.getDegree()) {
			return false;
		}
		else {
			int[] coeff = poly.getCoeff();
			
			for(int i = 0; i < this.degree; i++) {
				if(this.coeff[i] != coeff[i]) {
					return false;
				}
			}
			
			return true;
		}
	}
}
