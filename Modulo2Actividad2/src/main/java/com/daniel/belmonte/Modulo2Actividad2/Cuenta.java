package com.daniel.belmonte.Modulo2Actividad2;

public class Cuenta {
	protected double saldo;
	
	public Cuenta() {
		saldo = 0.0;
	}
	
	//public void setSaldo(double saldo)
	public void deposit(double saldo) {
		this.saldo = saldo;
	}
	
	//TERMINAR IMPLEMENTACION
	public boolean withdraw(double saldo) {
		return false;
	}
	
	//public double getSaldo()
	public double getBalance() {
		return saldo;
	}
	
	public String toString() {
		return Double.toString(saldo);
	}
}
