package com.daniel.belmonte.Modulo2Actividad2;

import java.text.DecimalFormat;

public class Cuenta {
	protected double saldo;
	DecimalFormat df;
	
	public Cuenta() {
		saldo = 0.0;
		df = new DecimalFormat("0.00");
	}
	
	//public void setSaldo(double saldo)
	public void deposit(double saldo) {
		this.saldo += saldo;
	}
	
	public void withdraw(double saldo) {
		this.saldo -= saldo;
	}
	
	//public double getSaldo()
	public double getBalance() {
		return saldo;
	}
	
	public String toString() {
		return df.format(saldo);
	}
}
