package com.beeva.drols.drolsR.modelo;

public class Cuenta {
	private double deposito;
	private double balance;
	private String tipo;
	private static String mensaje;
	
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getMensaje() {
		return mensaje;
	}
	public static void setMensaje(String mensaje1) {
		mensaje = mensaje1;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
