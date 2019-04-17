package com.daniel.belmonte.Modulo1Actividad11;

import java.util.ArrayList;

public class ListaNumeros {
	private ArrayList<Double> lista;
	private int positivos;
	private int negativos;
	
	public ListaNumeros(){
		lista = new ArrayList<Double>();
		positivos = 0;
		negativos = 0;
	}
	
	public ArrayList<Double> getLista() {
		return lista;
	}
	
	public void setLista(ArrayList<Double> lista) {
		this.lista = lista;
	}
	
	public int getPositivos() {
		return positivos;
	}
	
	public void setPositivos(int positivos) {
		this.positivos = positivos;
	}
	
	public int getNegativos() {
		return negativos;
	}
	
	public void setNegativos(int negativos) {
		this.negativos = negativos;
	}
	
	public boolean addValor(double valor) {
		if(this.lista.add(valor)) {
			if(valor >= 0) {
				this.positivos += 1;
				return true;
			}
			else {
				this.negativos += 1;
				return true;
			}
		}
		
		return false;
	}
}
